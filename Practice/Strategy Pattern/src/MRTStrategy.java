public class MRTStrategy implements PriceStrategy {
    @Override
    public int calculate(int km) {

    	//�p��Q����20���A�W�L�C����������

        int result = 0 ;

        if(km <= 0) return  result ;

        if(km <= 20) {
            result = 20 ;
        }

        if(km > 20){
            int count = (( km - 20 ) / 5 ) + 1 ;
            result = result + 5 * count ;
        }

        return result;

    }
}
