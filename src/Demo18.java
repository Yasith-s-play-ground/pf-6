void main() {
    int[] nums = {1, 2, 3, 4};
    int[] ref = nums;
    System.out.println(nums == ref);
    nums[1] = 20;
    System.out.println(ref[1]);
    int[] clone = ref.clone();

    System.out.println(clone == ref);
    System.out.println(clone.equals(ref));

    ref[2] = 30;
    System.out.println(nums[2]);
    System.out.println(clone[2]);

}