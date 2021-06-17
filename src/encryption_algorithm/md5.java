package encryption_algorithm;

class md5 {
    //初始的几个寄存器值
    private long A = 0x67452301;
    private long B = (int)0xefcdab89;
    private long C = (int)0x98badcfe;
    private long D = 0x10325476;

    private byte[] inp;
    md5(byte[] input){
        this.inp = input;
    }

    //需要的四个函数
    long fun_F(long x, long y, long z){
        return (x&y)|((~x)&z);
    }
    long fun_G(long x, long y, long z){
        return (x&z)|((~z)&y);
    }
    long fun_H(long x, long y, long z){
        return x^y^z;
    }
    long fun_I(long x, long y, long z){
        return y^(x|(~z));
    }

    //首先进行补位
    public byte[] fillByte()
    {
        int len = inp.length;
//        System.out.println("plaintext len "+len);
        int reslen = ((len / 512)+1) * 512;
        byte[] res = new byte[reslen];
        for (int j=0;j<reslen-64;j++)
        {
            if (j<len)
                res[j] = inp[j];
            else if (j==len)
                res[j] = 1;
            else
                res[j] = 0;
        }
        len = len % (int)Math.pow(2,64);
        int s = 63;
        for (int j=reslen-64;j<reslen;j++)
        {
            res[j] = (byte) ((len>>s)&1);
            s--;
        }
        return res;
    }

    public byte[] process(byte[] f1)
    {
        int len = f1.length;
        byte[] res = new byte[len];

        int epoch = len % 512;

        for (int i=0;i<epoch;i++)
        {
            
        }

        return res;
    }

    public byte[] getCipher()
    {
        //补充数据和长度
        byte[] f1 = fillByte();
        //处理数据段
//        byte[] f2 =

        return f1;
    }


}