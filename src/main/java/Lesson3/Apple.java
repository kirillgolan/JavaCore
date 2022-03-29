package Lesson3;

class Apple extends Fruit{
    public Apple(int count){
        super(count);
        this.weight_coeff = 1;
    }

    @Override
    public String toString() {
        return "Яблоки {" + count + " штук, массой "+getWeight()+ "f}";
    }
}