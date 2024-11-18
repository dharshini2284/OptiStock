package inventoryapp;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CustomerPage extends javax.swing.JPanel {

    public CustomerPage() {
        initComponents();
        loadDataSet();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        entryPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        locationText = new javax.swing.JTextField();
        codeText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        creditText = new javax.swing.JTextField();
        debitText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        custTable = new javax.swing.JTable();

        setBackground(Color.BLACK);
        jSeparator1.setBackground(new Color(57, 255, 20));
        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 15));
        jLabel1.setText("CUSTOMERS");
        jLabel1.setForeground(new Color(57, 255, 20));
        
        entryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE),"Enter Customer Details", javax.swing.border.TitledBorder.LEFT,javax.swing.border.TitledBorder.TOP, 
                            new java.awt.Font("Arial", java.awt.Font.BOLD, 14), new Color(57, 255, 20) ));

        jLabel2.setText("Customer Code:");
        jLabel2.setForeground(new Color(57, 255, 20));

        jLabel3.setText("Full Name:");
        jLabel3.setForeground(new Color(57, 255, 20));

        jLabel4.setText("Location:");
        jLabel4.setForeground(new Color(57, 255, 20));

        jLabel5.setText("Contact:");
        jLabel5.setForeground(new Color(57, 255, 20));

        jLabel6.setText("Debit Amount:");
        jLabel6.setForeground(new Color(57, 255, 20));

        jLabel7.setText("Credit Amount:");
        jLabel7.setForeground(new Color(57, 255, 20));

        addButton.setText("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(new Color(57, 255, 20));
        addButton.setFocusable(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         deleteButton.setBackground(Color.BLACK);
        deleteButton.setForeground(new Color(57, 255, 20));
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
        entryPanel.setLayout(entryPanelLayout);
        entryPanel.setBackground(Color.BLACK);
        entryPanelLayout.setHorizontalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(creditText)
                            .addComponent(debitText)
                            .addComponent(locationText)
                            .addComponent(codeText)
                            .addComponent(nameText)))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        entryPanelLayout.setVerticalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(deleteButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        custTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        custTable.setBackground(new Color(57, 255, 20));
        custTable.setForeground(Color.BLACK);
        custTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(custTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }                      

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (codeText.getText().equals("") || nameText.getText().equals("")
                || locationText.getText().equals("") || phoneText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please enter all the required details.");
        else {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustCode(codeText.getText());
            customerDTO.setFullName(nameText.getText());
            customerDTO.setLocation(locationText.getText());
            customerDTO.setPhone(phoneText.getText());
            new CustomerDAO().addCustomerDAO(customerDTO);
            loadDataSet();
        }
    }                                         

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new CustomerDAO().deleteCustomerDAO(custTable.getValueAt(custTable.getSelectedRow(),0).toString());
                loadDataSet();
    }                                            

    private void custTableMouseClicked(java.awt.event.MouseEvent evt) {                                       
        int row = custTable.getSelectedRow();
        int col = custTable.getColumnCount();
        Object[] data = new Object[col];

        for (int i=0; i<col; i++)
            data[i] = custTable.getValueAt(row, i);
        codeText.setText((String) data[0]);
        nameText.setText((String) data[1]);
        locationText.setText((String) data[2]);
        phoneText.setText((String) data[3]);
    }                                      

    public void loadDataSet() {
        try {
            CustomerDAO customerDAO = new CustomerDAO();
            custTable.setModel(customerDAO.buildTableModel(customerDAO.getQueryResult()));
        } catch (SQLException e) {
        }
    }
    public void loadSearchData(String text) {
        try {
            CustomerDAO customerDAO = new CustomerDAO();
            custTable.setModel(customerDAO.buildTableModel(customerDAO.getCustomerSearch(text)));
        } catch (SQLException e) {
        }
    }

     javax.swing.JButton addButton;
     javax.swing.JTextField codeText;
     javax.swing.JTextField creditText;
     javax.swing.JTable custTable;
     javax.swing.JTextField debitText;
     javax.swing.JButton deleteButton;
     javax.swing.JPanel entryPanel;
     javax.swing.JLabel jLabel1;
     javax.swing.JLabel jLabel2;
     javax.swing.JLabel jLabel3;
     javax.swing.JLabel jLabel4;
     javax.swing.JLabel jLabel5;
     javax.swing.JLabel jLabel6;
     javax.swing.JLabel jLabel7;
     javax.swing.JScrollPane jScrollPane1;
     javax.swing.JSeparator jSeparator1;
     javax.swing.JTextField locationText;
     javax.swing.JTextField nameText;
     javax.swing.JTextField phoneText;
}

