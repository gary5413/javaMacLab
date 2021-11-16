public class Ex_05_10b {
	public static void main(String[] argv) {
		int level = 5;
		switch(level) {
			default:
				System.out.println("您非法升級, 是不是用外掛啊？");
			case 1:
        System.out.println("恭喜您升 1 級了");
        break;
      case 2:
        System.out.println("恭喜您升 2 級了");
        break;
		}
	}
}
