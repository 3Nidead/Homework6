public class Main {
    public static void main(String[] args) {
//Задача1
for (int a = 1; a <= 10; a++){
    System.out.println(a);
}
//Задача2
for (int b = 10; b >= 1; b--){
    System.out.println(b);
}
//Задача3
for (int c = 0; c <= 17; c = c+2){
    System.out.println(c);
}
//Задача4
for (int d = 10; d >= -10; d--){
    System.out.println(d);
}
//Задача5
for (int e = 1904; e <=2096; e = e + 4){
    System.out.println(e + " год является високосным");
}
//Задача6
for (int f = 7; f <= 98; f = f + 7){
    System.out.println(f);
}
//Задача7
for (int g = 1; g <= 512; g = g * 2){
    System.out.println(g);
}
//Задача8
int money = 29000;
int total = 0;
for (int h = 1; h <= 12; h++){
    total = total + money;
    System.out.println("Месяц " + h + ", сумма накоплений равна " + total + " рублей");
}
//Задача9
int cash = 29000;
int deposit = 0;
for (int i = 1; i <= 12; i++){
    deposit = deposit + deposit/100;
    deposit = deposit + cash;
    System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
}
//Задача10
int x = 2;
for (int j = 1; j <= 10; j++){
    System.out.println(x+ "*" + j + "="+ x*j);
}







    }
}