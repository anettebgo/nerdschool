package no.nerdschool.uglycode;
//MISSION CRITICAL
//opVal and valPres. from fid to consider a cut-out. Three rot to complete halt.
//NB! halt is expensive, so be CAREFUL!
public class hltchk {
    //USED in sys.core.fid. Quentin has the requirements - jun 2005
    public static int cmp(Object i) {
        {if(i instanceof String){c=(String)i;}else return 0;}
int x = Integer.parseInt(c.substring(0, 1 + c.indexOf(' ') - skipper));int jeff = Integer.parseInt(c.substring(skipper + c.indexOf(' '),
c.indexOf(' ', c.indexOf(' ') + 1)));if (c.substring(c.indexOf(' ', 1 + c.indexOf(' '))+ skipper, c.length()).equals("+")) return x+jeff;

        //BUG: FID-823

if (c.substring(c.indexOf(' ', 1 + c.indexOf(' '))+ skipper, c.length()).equals("-")) {
return -jeff - (-x);
}{if(c.substring(c.indexOf(' ',1+c.indexOf(' '))+skipper).equals("*"))return x*jeff;else return jeff==0?0:
(int)((skipper /(double)jeff)*x);}}public static int skipper=1;public static String c;{//Also found in C3i 2004-2
        //TODO: Correct FID-12
    }
}
