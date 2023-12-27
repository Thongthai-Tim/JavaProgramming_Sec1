import javax.swing.JOptionPane;

public class Lab706 {

	public static void main(String[] args) {
		int [] nums = {25,78,41,22,36,85,37};
		
		int indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));

		
		while(checkIndex(nums,indexNumb)) {
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again :"));
	
		}
		
		JOptionPane.showMessageDialog(null,"Current data,nums["+indexNumb+"] is "+currentData(nums,indexNumb)+
				"\n"+((indexNumb-1<0)?"no previous data":"Previos data nums["+(indexNumb-1)+"]"+" is "+ nums[indexNumb-1])+
				"\n"+((indexNumb+1>=nums.length)?"no Next data":"Next data nums["+(indexNumb+1)+"]"+" is " + nums[indexNumb+1]));
     }
	public static boolean checkIndex(int[] number, int index) {
		/*if((index>=number.length)||(index<0)){
			return true;
		}
		else {
			return false;
		}*/
		return ((index>=number.length)||(index<0))?true:false;
	}
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] pNums,int pIndex) {
		return pNums[pIndex-1];
	}
	public static int nextData(int[] nNums,int nIndex) {
		return nNums[nIndex+1];
	}
}
