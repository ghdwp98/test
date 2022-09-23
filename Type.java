class Type {

    public static void main(String[] args) {
        byte a=12;
        short b=123;
        int c=12345;
        long d=123456789;
        char e='A';
        float f=12.34f;   //기본적으로 double형으로 인식을 해서 float형 쓰려면 뒤에 f붙여주자 
        double g=123.456;
        boolean h=false;

        System.out.printf("byte a: %d\n",a);
        System.out.printf("short b: %d\n",b);
        System.out.printf("int c: %d\n",c);
        System.out.printf("long d: %d\n",d);
        System.out.printf("char e: %s\n",e);
        System.out.printf("float f: %.2f\n",f);
        System.out.printf("double g: %.3f\n",g);
        System.out.println("boolean h: "+h);

        

    }
}
