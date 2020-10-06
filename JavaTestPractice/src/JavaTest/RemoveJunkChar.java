package JavaTest;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		
		String ulr="https://p4d.tm.cfs.cloud.slb-ds.com/api/v2/routes/undefined?path=%2Flaunch%3Fapp%3D%5BPetrel%5D%26args%3D%22%5C%5Cseismic-storage%5Cdata%5CUserSeismic%5Chdeore%5CRESanity.pet%22";
		System.out.println(ulr);
		String SortedUrl=ulr.replaceAll("[^a-zA-Z,:,/,-,.,=]", "");
		System.out.println(SortedUrl);
		
	}

}
