package OOPs.Polymorphism;

class ComputeTotal {
    public int total(int a , int b){
        return a + b;
    }
    public int total(int a , int b , int c){
        return a + b + c;
    }
}

class MethodOverLoading{
    public static void main(String[] args) {
        ComputeTotal computeTotal = new ComputeTotal();
        System.out.println(computeTotal.total(4, 2));
        System.out.println(computeTotal.total(1, 2, 4));
    }
}