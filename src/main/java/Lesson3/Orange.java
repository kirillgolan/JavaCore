package Lesson3;

class Orange extends Fruit{            // апельсины
    public Orange(int count){
        super(count);
        this.weight_coeff = 1.5;
    }

    @Override
    public String toString() {
        return "Апельсины {" + count + " штук, массой "+getWeight()+ "f}";
    }
}