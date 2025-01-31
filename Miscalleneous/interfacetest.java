class interfacetest {
    public static void main(String[] args) {
        Callback c = new interfacedemo();
        Callback ob = new interfacedemo2();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
