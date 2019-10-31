package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: rehearsal
 * @description: ReadingListController
 * @author: LiShuLin
 * @create: 2019-08-14 14:28
 **/
@Controller
@RequestMapping("/")
public class ReadingListController {

    private ReadingListRepository readingListRepository;

    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> readingList =
                readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }

    public static void main(String[] args) {
        int i = 0;
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        arr[i++] = arr[i++] + 2;

        for (int j =0,length = arr.length;j<length;j++){
            System.out.print(arr[j]);
        }
        System.out.println("进来了");
        System.arraycopy(arr,1,arr,0,arr.length-1);
        for (Integer inte:arr) {
            System.out.print(inte);
        }
        List arrayList = new ArrayList();
        arrayList.add("123");
        arrayList.add("1234");
        arrayList.add("1235");
        arrayList.add("1236");
        System.out.println(arrayList.toString());

    }
}
