/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine;

import java.sql.SQLException;

/**
 *
 * @author fafan
 */
public interface Logger {

    public void log(String coffeename, String coffeetype, int water, int coffe, int grind, float caffeine) throws ClassNotFoundException, SQLException;
}
