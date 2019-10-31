package com.rehearsal.refactoring.pro6.pro6_6;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Split Temporary Variable（剖解临时变量）
 * @date 2019-08-19 14:04
 */
public class Example {
    private double _primaryForce;
    private double _mass;
    private int _delay;
    private double _secondaryForce;

    double getDistanceTravelled(int time) {
        double result;
        double acc = _primaryForce / _mass;        //译注：第一次赋值处
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;        //以下是第二次赋值处
            acc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}

/*------------------------------------after------------------------------*/
class ExampleNew {
    private double _primaryForce;
    private double _mass;
    private int _delay;
    private double _secondaryForce;

    double getDistanceTravelled(int time) {
        double result;
        result = calculation(primaryTime(time),primaryAcc());
        if (secondaryTime(time) > 0) {
            result += second(time);
        }
        return result;
    }

    private double primaryAcc() {
        return _primaryForce / _mass;
    }

    private double secondaryAcc() {
        return (_primaryForce + _secondaryForce) / _mass;
    }

    private int primaryTime(int time) {
        return Math.min(time, _delay);
    }

    private int secondaryTime(int time) {
        return time - _delay;
    }

    private double calculation(int time,double acc) {
        return 0.5 * acc * doubleValue(time);
    }

    private double second(int time) {
        return primaryVel() * secondaryTime(time) + 0.5 * secondaryAcc()  * doubleValue(secondaryTime(time));
    }

    private double primaryVel() {
        return primaryAcc() * _delay;
    }

    private Integer doubleValue(Integer value) {
        return value * value;
    }


}
