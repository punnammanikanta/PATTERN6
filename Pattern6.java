public class Pattern6 {
    public static void main(String[]args){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==2&&j==3){
                System.out.print("o");
            }else if (i==3 &&(j==2||j==4)){
                System.out.print("o");
            }else if (i==4&&j==3){
                System.out.print("o");
            }else{
                System.out.print("#");
            }
        }
        System.out.println();
    }
    
}
}