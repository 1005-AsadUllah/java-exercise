// Date: 03/06/21
public class Generics1 {

    static class MyGeneric<T1>{
        int val;
        private T1 t1;
        public MyGeneric(int val ,T1 t1){
            this.val=val;
            this.t1 = t1;
        }

        public T1 getT1() {
            return t1;
        }

        public void setT1(T1 t1) {
            this.t1 = t1;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
        

    }
    public static void main(String[] args) {
        MyGeneric<Integer> g1 = new MyGeneric<>( 23, 100);
        int a = g1.getT1();
        System.out.println(a);
    }
}

