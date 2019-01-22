class Missing {
	public static void main(String[] args) {
    missingChar("Robocop", 3);

    // receive command line argument if available
    if (args.length >= 2) {
      missingChar(args[0], Integer.parseInt(args[1]));
    }
  }

  private static void missingChar(String str, int n) {

	  if(n >= str.length() || n < 0) {
		 System.out.println("Please input a positive integer number!!");
		 return;
	   }

    String front = str.substring(0, n);
    String last = str.substring(n + 1, str.length());
  
    System.out.print(front + last);

  }
}
