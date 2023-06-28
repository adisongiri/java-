interface cycle{
    void brakeApply(int decrement);
    void speedUP(int increment);

}
 class MYcycle implements cycle {
    int speed=7;

     @Override
     public void brakeApply(int decrement) {
         speed=speed-decrement;
     }

     public void speedUP(int increment){
        speed=speed+increment;
    }
}