public class FizzBuzz {

  private int specialNumA;
  private int specialNumB;
  private String speciaCharA;
  private String speciaCharB;

  public FizzBuzz(int specialNumA, int specialNumB) {
    this.specialNumA = specialNumA;
    this.specialNumB = specialNumB;
    this.speciaCharA = Integer.toString(specialNumA);
    this.speciaCharB = Integer.toString(specialNumB);
  }

  public String getFizzBuzzGameResults(int[] nums) {
    StringBuilder resultsBuilder = new StringBuilder();
    for (int num : nums) {
      resultsBuilder.append(covertFizzBuzzNum(num));
      resultsBuilder.append("\n");
    }
    return resultsBuilder.toString();
  }

  public String covertFizzBuzzNum(int num) {
    boolean isFizzResult = isFizz(num);
    boolean isBuzzResult = isBuzz(num);
    if (isFizzResult) {
      if (isBuzzResult) {
        return "FizzBuzz";
      }
      return "Fizz";
    }
    if (isBuzzResult) {
      return "Buzz";
    }
    return Integer.toString(num);
  }

  public boolean isFizz(int num) {
    String numStr = Integer.toString(num);
    if (num % specialNumA == 0 || numStr.contains(speciaCharA)) {
      return true;
    }
    return false;
  }

  public boolean isBuzz(int num) {
    String numStr = Integer.toString(num);
    if (num % specialNumB == 0 || numStr.contains(speciaCharB)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz(3, 5);
    int[] nums = new int[100];
    for (int i = 1; i <= 100; i++) {
      nums[i-1] = i;
    }
    System.out.print(fizzBuzz.getFizzBuzzGameResults(nums));
  }

}
