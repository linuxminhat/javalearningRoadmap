//public class ArrayMagic {
//     
//    public int findSecondLargestElement(int[] array) {
//        int firstLargestElement = Integer.MIN_VALUE;
//        int secondLargestElement = Integer.MIN_VALUE;
//        for(int temp_value : array){
//            if(array.length<2 || array.length==0){
//                return -1;
//            }
//            
//            if(value>firstLargestElement){
//                secondLargestElement=firstLargestElement;
//                firstLargestElement=value;
//            }else{
//                if(value>secondLargestElement && value != firstLargestElement){
//                    secondLargestElement=value;
//                }
//            }
//        }
//        return secondLargestElement;
//    }
//}