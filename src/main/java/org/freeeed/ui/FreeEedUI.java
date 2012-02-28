package org.freeeed.ui;

import com.google.common.io.Files;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import org.freeeed.main.*;
import org.freeeed.services.*;

/**
 *
 * @author mark
 */
public class FreeEedUI extends javax.swing.JFrame {

    private static FreeEedUI instance;

    public static FreeEedUI getInstance() {
        return instance;
    }

    /**
     * Creates new form Main
     */
    public FreeEedUI() {
        FreeEedLogging.init(true);
        initComponents();
        showHistory();
        instance = this;
        System.out.println(Version.getVersionAndBuild());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuItemNewProject = new javax.swing.JMenuItem();
        menuItemOpenProject = new javax.swing.JMenuItem();
        menuOpenRecent = new javax.swing.JMenu();
        menuItemExit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        menuItemProjectSettings = new javax.swing.JMenuItem();
        processMenu = new javax.swing.JMenu();
        stageMenuItem = new javax.swing.JMenuItem();
        processMenuItem = new javax.swing.JMenuItem();
        processSeparator = new javax.swing.JPopupMenu.Separator();
        historyMenuItem = new javax.swing.JMenuItem();
        reviewMenu = new javax.swing.JMenu();
        menuItemOutputFolder = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        featureRequestMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FreeEed - Graphical User Interface");

        fileMenu.setText("Project");

        menuItemNewProject.setText("New");
        menuItemNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemNewProject);

        menuItemOpenProject.setText("Open");
        menuItemOpenProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemOpenProject);

        menuOpenRecent.setText("Open recent");
        fileMenu.add(menuOpenRecent);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemExit);

        mainMenu.add(fileMenu);

        editMenu.setText("Edit");

        menuItemProjectSettings.setText("Project settings");
        menuItemProjectSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjectSettingsActionPerformed(evt);
            }
        });
        editMenu.add(menuItemProjectSettings);

        mainMenu.add(editMenu);

        processMenu.setText("Process");

        stageMenuItem.setText("Stage");
        stageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stageMenuItemActionPerformed(evt);
            }
        });
        processMenu.add(stageMenuItem);

        processMenuItem.setText("Process");
        processMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processMenuItemActionPerformed(evt);
            }
        });
        processMenu.add(processMenuItem);
        processMenu.add(processSeparator);

        historyMenuItem.setText("History");
        historyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyMenuItemActionPerformed(evt);
            }
        });
        processMenu.add(historyMenuItem);

        mainMenu.add(processMenu);

        reviewMenu.setText("Review");

        menuItemOutputFolder.setText("Open output folder");
        menuItemOutputFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOutputFolderActionPerformed(evt);
            }
        });
        reviewMenu.add(menuItemOutputFolder);

        mainMenu.add(reviewMenu);

        helpMenu.setText("Help");

        featureRequestMenuItem.setText("Feature suggestion");
        featureRequestMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featureRequestMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(featureRequestMenuItem);

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenu.add(helpMenu);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        new AboutDialog(this, true).setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        exitApp();
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemOpenProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenProjectActionPerformed
        openProject();
    }//GEN-LAST:event_menuItemOpenProjectActionPerformed

    private void menuItemProjectSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjectSettingsActionPerformed
        showProjectSettings();
    }//GEN-LAST:event_menuItemProjectSettingsActionPerformed

	private void menuItemNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewProjectActionPerformed
            openNewProject();
	}//GEN-LAST:event_menuItemNewProjectActionPerformed

	private void stageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stageMenuItemActionPerformed
            stageProject();
	}//GEN-LAST:event_stageMenuItemActionPerformed

	private void processMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processMenuItemActionPerformed
            try {
                runProcessing();
            } catch (FreeEedException e) {
                JOptionPane.showMessageDialog(this, "There were some problems with processing, \""
                        + e.getMessage() + "\n"
                        + "please check console output");
            }
	}//GEN-LAST:event_processMenuItemActionPerformed

	private void historyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyMenuItemActionPerformed
            showHistory();
	}//GEN-LAST:event_historyMenuItemActionPerformed

	private void menuItemOutputFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOutputFolderActionPerformed
            openOutputFolder();
	}//GEN-LAST:event_menuItemOutputFolderActionPerformed

    private void featureRequestMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featureRequestMenuItemActionPerformed
        new FeatureRequestDialog(this, true).setVisible(true);
    }//GEN-LAST:event_featureRequestMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FreeEedUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem featureRequestMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem historyMenuItem;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemNewProject;
    private javax.swing.JMenuItem menuItemOpenProject;
    private javax.swing.JMenuItem menuItemOutputFolder;
    private javax.swing.JMenuItem menuItemProjectSettings;
    private javax.swing.JMenu menuOpenRecent;
    private javax.swing.JMenu processMenu;
    private javax.swing.JMenuItem processMenuItem;
    private javax.swing.JPopupMenu.Separator processSeparator;
    private javax.swing.JMenu reviewMenu;
    private javax.swing.JMenuItem stageMenuItem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setVisible(boolean b) {
        myInitComponents();
        super.setVisible(b);
    }

    private void myInitComponents() {
        Settings.load();
        addWindowListener(new FrameListener());
        setBounds(64, 40, 640, 400);
        setTitle("FreeEed " + FreeEedUtil.TM + " - Hadoop e-Discovery, Search and Analytics Platform");
        setupRecentProjectMenu();
    }

    private void exitApp() {
        if (!isExitAllowed()) {
            return;
        }
        Settings.getSettings().save();
        // TODO verify - is that a standard way to exit? What is the user clicks on "X", how do we disallow
        setVisible(false);
        System.exit(0);
    }

    private boolean isExitAllowed() {
        return true;
    }

    private void openProject() {
        try {
            JFileChooser fileChooser = new JFileChooser();
            //fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            fileChooser.addChoosableFileFilter(new ProjectFilter());
            File f = null;
            Settings settings = Settings.getSettings();
            if (settings.getCurrentDir() != null) {
                f = new File(settings.getCurrentDir());
            } else {
                try {
                    f = new File(new File(".").getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }
            }
            // Set the current directory
            fileChooser.setCurrentDirectory(f);
            fileChooser.setDialogTitle("Select project file");
            fileChooser.showOpenDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile == null) {
                return;
            }
            settings.setCurrentDir(selectedFile.getParent());
            Project project = Project.loadFromFile(selectedFile);
            project.setProjectFilePath(selectedFile.getPath());
            updateTitle(project.getProjectCode() + " " + project.getProjectName());
            History.appendToHistory("Opened project file: " + selectedFile.getPath());
            settings.addRecentProject(selectedFile.getPath());
            showProjectSettings();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private class ProjectFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            String filename = file.getName();
            return filename.endsWith(".project") || file.isDirectory();
        }

        @Override
        public String getDescription() {
            return "Project files";
        }
    }

    public void updateTitle(String title) {
        if (title != null) {
            setTitle("FreeEed " + FreeEedUtil.TM + " - " + title);
        } else {
            setTitle("FreeEed" + FreeEedUtil.TM);
        }
    }

    private boolean showProjectSettings() {
        if (Project.getProject().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please create or open a project first");
            return false;
        }
        ProjectSettingsUI dialog = new ProjectSettingsUI(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        boolean ok = (dialog.getReturnStatus() == ProjectSettingsUI.RET_OK);
        return ok;
    }

//    private void saveProject() {
//        Project project = Project.getProject();
//        if (project.isEmpty()) {
//            JOptionPane.showMessageDialog(rootPane, "You have no project open");
//            return;
//        }
//        String projectPath = project.getProjectFilePath();
//        if (projectPath == null) {
//            saveProjectAs();
//            return;
//        }
//        project.save();
//    }

    private void saveProjectAs() {
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            File f = null;
            Settings settings = Settings.getSettings();
            if (settings.getCurrentDir() != null) {
                f = new File(settings.getCurrentDir());
            } else {
                try {
                    f = new File(new File(".").getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }
            }
            // Set the current directory
            fileChooser.setCurrentDirectory(f);
            fileChooser.setDialogTitle("Save project");
            fileChooser.showSaveDialog(
                    this);
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile == null) {
                return;
            }
            String projectFile = selectedFile.getPath();

            settings.setCurrentDir(new File(projectFile).getParent());
            settings.save();
            if (!projectFile.endsWith(".project")) {
                projectFile += ".project";
            }
            Project project = Project.getProject();
            project.setProjectFilePath(projectFile);
            History.appendToHistory("Saved project " + projectFile);
            Project.getProject().save();
            settings.addRecentProject(selectedFile.getPath());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void openNewProject() {
        Project project = Project.loadFromFile(new File(ParameterProcessing.DEFAULT_PARAMETER_FILE));
        project.generateProjectCode();
        project.setProjectName(project.getNewProjectName());
        updateTitle(project.getProjectCode() + " " + project.getProjectName());
        boolean statusOK = showProjectSettings();
    }

    private void stageProject() {
        Project project = Project.getProject();
        if (project.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please create or open a project first");
            return;
        }        
        project.setRun();
        try {
            FreeEedMain.getInstance().runStagePackageInput();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    private void runProcessing() throws FreeEedException {
        Project project = Project.getProject();
        if (project.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please create or open a project first");
            return;
        }
        FreeEedMain mainInstance = FreeEedMain.getInstance();
        if (new File(project.getResultsDir()).exists()) {
            // in most cases, it won't already exist, but just in case
            try {
                Files.deleteRecursively(new File(project.getResultsDir()));
            } catch (Exception e) {
                throw new FreeEedException(e.getMessage());
            }
        }
        String processWhere = project.getProcessWhere();
        if (processWhere != null) {
            mainInstance.runProcessing(processWhere);
        } else {
            throw new FreeEedException("No processing option selected.");
        }
    }

    private void showHistory() {
        HistoryUI ui = new HistoryUI();
        ui.setVisible(true);
    }

    private void openOutputFolder() {
        Project project = Project.getProject();
        if (project == null || project.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please open a project first");
            return;
        }
        if (chooseRun(project) == false) {
            JOptionPane.showMessageDialog(this, "No output results to show");
            return;
        }
        String resultsFolder = project.getResultsDir();

        try {
            boolean success = Review.deliverFiles();
            if (!success) {
                JOptionPane.showMessageDialog(this, "No results yet");
                return;
            }
            // Desktop should work, but it stopped lately in Ubuntu
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File(resultsFolder));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (PlatformUtil.getPlatform() == PlatformUtil.PLATFORM.LINUX) {
                String command = "nautilus " + resultsFolder;
                PlatformUtil.runUnixCommand(command);
            } else if (PlatformUtil.getPlatform() == PlatformUtil.PLATFORM.MACOSX) {
                String command = "open " + resultsFolder;
                PlatformUtil.runUnixCommand(command);
            }
        }
    }

    class FrameListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            Settings.getSettings().save();
        }
    }

    private void setupRecentProjectMenu() {
        Settings setting = Settings.getSettings();
        List<Properties> recentProjects = setting.getRecentProjects();
        for (Properties recentProject : recentProjects) {
            JMenuItem item = new JMenuItem();
            item.setText(recentProject.getProperty(ParameterProcessing.PROJECT_CODE)
                    + " "
                    + recentProject.getProperty(ParameterProcessing.PROJECT_NAME));
            item.setName(recentProject.getProperty(ParameterProcessing.PROJECT_FILE_PATH));
            menuOpenRecent.add(item);
            item.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    JMenuItem item = (JMenuItem) evt.getSource();
                    String filePath = item.getName();
                    File selectedFile = new File(filePath);
                    Settings settings = Settings.getSettings();
                    settings.setCurrentDir(selectedFile.getParent());
                    Project project = Project.loadFromFile(selectedFile);
                    project.setProjectFilePath(selectedFile.getPath());
                    updateTitle(project.getProjectCode() + " " + project.getProjectName());
                    History.appendToHistory("Opened project file: " + selectedFile.getPath());
                    settings.addRecentProject(selectedFile.getPath());
                    showProjectSettings();
                }
            });
        }
    }

    private boolean chooseRun(Project project) {
        if (!project.getRun().isEmpty()) {
            return true;
        }
        String runDir = project.getRunsDir();
        File[] files = new File(runDir).listFiles();
        ArrayList<String> runs = new ArrayList<String>();
        for (File file : files) {
            if (file.getName().startsWith("run")) {
                runs.add(file.getName() + File.separator);
            }
        }
        if (runs.isEmpty()) {
            return false;
        }
        if (runs.size() == 1) {
            project.setRun(runs.get(0));
            return true;
        }
        String run = (String) JOptionPane.showInputDialog(
                null,
                "Please choose run",
                "Project run selection",
                JOptionPane.PLAIN_MESSAGE,
                null,
                runs.toArray(new String[runs.size()]),
                runs.get(0));
        if (run == null) {
            return false;
        }
        project.setRun(run);
        return true;
    }
}
