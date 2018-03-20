/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak;
public abstract class trukrambo {
    private int jarak,JmlhBensin;
    private String TipeTransmisi,TipeJendela;
    private boolean bakterbuka;
    private boolean bak;
    
    public trukrambo(int jarak){
        this.jarak=jarak;
        bakterbuka=false;
    }
    public void printdata(){
        System.out.println("tranmisi : "+gettransmisi());
    }
    public void settransmisi(String TipeTransmisi){
        this.TipeTransmisi=TipeTransmisi;
    } 
    public String gettransmisi(){
        return TipeTransmisi;
    }
    public abstract void settipetransmisi();
}