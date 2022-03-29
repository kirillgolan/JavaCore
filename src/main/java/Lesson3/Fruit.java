package Lesson3;

abstract class Fruit{
    double weight_coeff;
    int count;

    public Fruit(int value){
        this.count = value;
    }

    public Double getWeight(){
        double result = this.count*this.weight_coeff;
        return result;
    }
}