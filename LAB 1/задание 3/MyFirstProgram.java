class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass element = new MySecondClass(1, 2);
        System.out.println(element.multiply());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                element.setchislo1(i);
                element.setchislo2(j);
                System.out.print(element.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass{
    // два приватных поля типа int
    private int chislo1;
    private int chislo2;

    // методы для получения и модификации их значений
    // возвращает 1 число
    public int getchislo1() {
        return chislo1;
    }
    // возвращает 2 число
    public int getchislo2() {
        return chislo2;
    }
    // устанавливает значение 1 числа
    public void setchislo1(int chislo1) {
        this.chislo1 = chislo1;
    }
    // устанавливает значение 2 числа
    public void setchislo2(int chislo2) {
        this.chislo2 = chislo2;
    }

    // конструктор, создающий объект и инициализирующий значения полей
    MySecondClass(int chislo1, int chislo2)
    {
        this.chislo1 = chislo1;
        this.chislo2 = chislo2;
    }

    // метод с возвращаемым типом int
    public int multiply(){
        return chislo1 << chislo2; //побитовый сдвиг влево
    }
}