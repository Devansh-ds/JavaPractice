class throwtest {
    static void throwexec() throws IllegalAccessException {
        System.out.println("Inside throwexec");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            throwexec();
        } catch (IllegalAccessException e) {
            System.out.println("Caught"+ e);
        }
    }
}