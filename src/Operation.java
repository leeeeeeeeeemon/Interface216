public enum Operation {
    SUM{
        public int action(int x, int y){
            return x+y;
        }
    },
    SUB{
        public int action(int x, int y){return x-y;}
    },
    MUL{
        public int action(int x, int y){return x * y;}
    };
    public abstract int action(int x, int y);
    private int mn;


}
