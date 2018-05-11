/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexGonza.examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.alexGonza.examen.Accion"
)
@ActionRegistration(
        iconBase = "com/alexGonza/examen/iconoExamen.png",
        displayName = "#CTL_Accion"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 0)
    ,
  @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_Accion=Accion")
public final class Accion implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
