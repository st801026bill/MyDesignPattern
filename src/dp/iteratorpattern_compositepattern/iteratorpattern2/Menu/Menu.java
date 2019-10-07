/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern2.Menu;

import java.util.Iterator;

/**
 *
 * @author bill
 * 3. 建立一個簡單介面，讓客戶能夠取得反覆器，並得知菜單內容。
 */
public interface Menu {
    public Iterator createIterator();
}
