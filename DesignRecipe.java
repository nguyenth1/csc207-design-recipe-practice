import java.util.Arrays;

	
			public class DesignRecipe {
			
				public static String[] intersperse(String s, String[] arr){
					if (s==null || arr==null){
						return null;
					}
					else if (arr.length < 2){
						return arr;
					}
					else {
					String[] ret = new String[2*arr.length-1];
					for (int i = 0; i < arr.length - 1; i++){
						ret[2*i]=arr[i];
						ret[2*i +1]=s;
					}
					ret[ret.length-1] = arr [arr.length-1];
					return ret;
				}
				}
			
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					
				    String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
			System.out.println (intersperse (null,null));
			System.out.println (intersperse ("a",null));
			System.out.println (intersperse (null, toppings));
			System.out.println (Arrays.toString (intersperse ("abc", toppings)));
			 }
				}	
