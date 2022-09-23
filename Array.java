class Array {
    public static void main(String[] args) {
        int[] a=new int[10];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=4;
        a[5]=5;
        a[6]=6;
        a[7]=7;
        a[8]=8;
        a[9]=9;

        int[][] b=new int[5][2];
        b[0][0]=0; b[0][1]=1; b[1][0]=2; b[1][1]=3; b[2][0]=4; b[2][1]=5; b[3][0]=6; b[3][1]=7; b[4][0]=8; b[4][1]=9;
     
        System.out.println("a:");
        for(int k=0;k<10;k++)
        {
       System.out.print(a[k]);
       if(k<9)
       {
        System.out.print(", ");
       }
    
        }
        System.out.println();
        System.out.println("b:");

//여기서 부터가 b출력 for문 
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][j]);
                if(j==0)
                {
                    System.out.print(", ");
                }
                
            }
            System.out.println();
        }
        
        // 길이 10의 정수형 1차원 배열변수 a를 new 연산자를 이용해 생성한다.
        // 배열 a의 원소에 순서대로 0부터 9까지의 값을 할당한다.
        // 5x2 크기를 갖는 정수형 2차원 배열변수 b를 new 연산자를 이용해 생성한다.  (5행 2열 2차원 배열)
        // 배열 b의 원소에 순서대로 0부터 9까지의 값을 할당한다.        
        // 두 배열을 README.md에 적힌 형식으로 출력한다.
    }
}
