public class BusStrategy implements PriceStrategy {
    @Override
    public int calculate(int km) {

    	//�@�q��15��
    	//�Q�������@�q���A�W�L�Q������q��

        int count = 0 ;

        if( km <= 10 ){
            count = 1 ;
        }else if( km > 10){
            count = 2 ;
        }

        return count * 15 ;

    }

}

