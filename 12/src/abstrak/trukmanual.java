/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak;
public class trukmanual extends trukrambo{
 public trukmanual(int jarak){
     super(jarak);
 }
    @Override
    public void settipetransmisi() {
        settransmisi("manual");
    }
}