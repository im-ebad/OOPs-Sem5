package B1;
public class B1{
	public static void main(String[] args) {
		VOperations obj = new VOperations();
		obj.initializer();
		System.out.println("The array:");
		obj.show();
		obj.linearSearch(77);
		System.out.println("The Sorted Array:");
		obj.bubbleSort();
		obj.show();
		obj.binarySearch(68);
	}
}

public class VOperations{
	int arr[];
	void initializer(){
		arr=new int []{11,6,77,8,5,44,6,9,442,86,73,49,68,82};
}	
	void linearSearch(int Se){
		System.out.print("\nLinear Search:");
		int flag=-1;
		for(int i=0;i<arr.length;i++){

			if(Se==arr[i]){
				flag=i;
				break;
			}
		}
		if(flag==-1)System.out.println(Se+" is not present in the array.");
		else System.out.println(Se+" found at index "+flag);
	}
	void binarySearch(int se){
		System.out.print("\nBinary Search:");
		int flag =-1;
		int low=0,high=arr.length-1;
		while(low<=high){
			int mid=(high+low)/2;
			if(arr[mid]==se){
				flag=mid;
				break;
			}
			else if(arr[mid]<se){
				low=mid+1;
			}
			else {
				high=mid-1;
			}	
		}
		if(flag==-1)System.out.println(se+" is not present in the array.");
		else System.out.println(se+" found at index "+flag);
	}

	void bubbleSort(){
		int temp=0;
		int flag=0;
		int i=0,j=0;
		for(i=0;i<arr.length-1;i++){
			flag=0;
			for(j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)break;
		}
	}
	void show(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}
