/*
 * The MIT License
 *
 * Copyright 2013 Rawand Nasih Fatih - rawandnf@gmail.com.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.brwskagroup.bgpasskeeper;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;



/**
 * Initializes the GUI of the project.
 *
 * @author Brwska Group (Rawand Fatih)
 */
public class MainFrame extends JFrame {

  private JMenuBar menuBar;
  private JMenu fileMenu;
  private JMenuItem newMenuItem;
  private JMenuItem openMenuItem;
  private JMenuItem saveMenuItem;
  private JMenuItem quitMenuItem;


  public MainFrame() {
    super(resources.Strings.APP_NAME);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    init();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }


  /**
   * Initializes the application.
   */
  private void init() {
    setUpMenuBar();
  }


  /**
   * Sets up the MenuBar. Adds the items and assign the actions.
   */
  private void setUpMenuBar() {
    initMenuBarItems();
    setUpFileMenu();
    setUpEditMenu();
    setJMenuBar(menuBar);
  }


  /**
   * Initializes MenuBar object items.
   */
  private void initMenuBarItems() {
    menuBar = new JMenuBar();
    fileMenu = new JMenu(resources.Strings.FILE_MENU);
    newMenuItem = new JMenuItem(resources.Strings.NEW_FILE_ITEM);
    openMenuItem = new JMenuItem(resources.Strings.OPEN_FILE_ITEM);
    saveMenuItem = new JMenuItem(resources.Strings.SAVE_FILE_ITEM);
    quitMenuItem = new JMenuItem(resources.Strings.QUIT_FILE_ITEM);
  }


  /**
   * Sets up the file menu, creates the file, its items and adds it to the
   * MenuBar with the actions.
   */
  private void setUpFileMenu() {
    fileMenu.add(newMenuItem);
    fileMenu.add(openMenuItem);
    fileMenu.add(saveMenuItem);
    fileMenu.add(new JSeparator());
    fileMenu.add(quitMenuItem);
    menuBar.add(fileMenu);
  }


  /**
   * Sets up the edit menu, creates the edit, its items and adds it to the
   * MenuBar with the actions.
   */
  private void setUpEditMenu() {

  }

}
