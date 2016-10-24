import java.util.HashMap;
import java.util.Map;


public class Twosum2 
{

	 public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int complement;

		for(int i = 0;i< nums.length;++i) //������Ҫѭ����������
		 { 
			complement = target - nums[i];
			if(map.containsKey(complement))// ����key 
			{
				return new int [] {map.get(complement),i};//ע����{map.get(complement),i},������{i,map.get(complement)};!!!
			}// ֻ��һ���������ĿҪ��

			map.put(nums[i],i);//������ϣ��key,value��,û�ж����Ԫ�أ�����
		 }	
        throw new IllegalArgumentException("No two sum solution");
    }
	

	public static void main(String[] args) 
	{
	// ����һ��	
	//	int a[]  = new int[11];
	//	for(int i = 0;i<a.length; ++i)
	//		a[i] = i+1;

	// ��������
	int a[]  = new int[] {2,7,11,15};
	int b[];
	b	=  twoSum(a,9);


		for(int i = 0;i<b.length;++i)
			System.out.print(b[i]+" ");
		System.out.print("\n");
		


	}
}
