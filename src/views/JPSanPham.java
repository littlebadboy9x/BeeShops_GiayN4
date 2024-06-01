package views;

import dao.ChatLieuDAO;
import dao.DayGiayDao;
import dao.DeGiayDao;
import dao.KichCoDAO;
import dao.MauSacDAO;
import dao.ProductDAO;
import dao.ProductDetaisDAO;
import dao.ThuongHieuDao;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ChatLieu;
import model.DayGiay;
import model.GetChucVu;
import model.HdeGiay;
import model.Ispct;
import model.IspctInsert;
import model.KichCo;
import model.MauSac;
import model.TenGiay;
import model.ThuongHieu;
import model.interfaceModels;
import utility.MsgBox;
import utility.Ximage;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class JPSanPham extends javax.swing.JFrame {

    /**
     * Creates new form JPSanPham
     */
    public JPSanPham() {
        initComponents();
        initSP();   //Fill SP lên khi khởi chạy
        initSPCT(); //Fill SPCT lên khi khởi chạy
        initTTSP(); //Fill kich thước lên khi khởi chạy
    }

    JPSanPham fa = this; //gán cho nó đến đối tượng hiện tại để khi đóng giao diện thêm nhanh thì nó thực hiện fill lại bảng

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_tblSPCT = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_SPCT = new javax.swing.JTable();
        rdo_HienThi_ALL_SPCT = new javax.swing.JRadioButton();
        txt_timKiemSPCT = new javax.swing.JTextField();
        btn_first = new javax.swing.JButton();
        lbl_trang = new javax.swing.JLabel();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        lbl_tongSoTrang = new javax.swing.JLabel();
        lbl_thongBao_SPCT = new javax.swing.JLabel();
        tbp = new javax.swing.JTabbedPane();
        tbp_SP = new javax.swing.JPanel();
        jpn_TTSP = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_maSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_tenSP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbb_trangThaiSP = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        lbl_avatar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_update1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txt_nguoiTaoSP = new javax.swing.JTextField();
        txt_nguoiSuaSP = new javax.swing.JTextField();
        txt_ngayTaoSP = new javax.swing.JTextField();
        txt_ngayCapNhatSP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpn_DSSP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dssp = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        rdo_dangKinhDoanh = new javax.swing.JRadioButton();
        rdo_dungKinhDoanh = new javax.swing.JRadioButton();
        rdo_tatCa = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        txt_timKiemSP = new javax.swing.JTextField();
        btn_firstSP = new javax.swing.JButton();
        btn_prevSP = new javax.swing.JButton();
        lbl_trangSP = new javax.swing.JLabel();
        btn_nextSP = new javax.swing.JButton();
        btn_lastSP = new javax.swing.JButton();
        lbl_tongSoTrangSP = new javax.swing.JLabel();
        tbp_SPCT = new javax.swing.JPanel();
        jpn_SPCT = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbb_tenSP = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_maSPCT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_soLuong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_giaBan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_moTa = new javax.swing.JTextArea();
        btn_congTenSP = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        cbb_thuongHieu = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        btn_congThuongHieu = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        cbb_kichThuoc = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        btn_congKichThuoc = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        cbb_mauSac = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        btn_congMauSac = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        cbb_chatLieu = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cbb_congChatLieu = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        cbb_deGiay = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        btn_congDeGiay = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        cbb_dayGiay = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        btn_congDayGiay = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_themSPCT = new javax.swing.JButton();
        btn_CapNhatSP = new javax.swing.JButton();
        btn_lamMoiSPCT = new javax.swing.JButton();
        btn_xuatFileExcel = new javax.swing.JButton();
        btn_xoaSPCT = new javax.swing.JButton();
        jpn_tblSPCT3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_SPCT4 = new javax.swing.JTable();
        rdo_HienThi_ALL_SPCT2 = new javax.swing.JRadioButton();
        txt_timKiemSPCT2 = new javax.swing.JTextField();
        btn_first2 = new javax.swing.JButton();
        lbl_trang2 = new javax.swing.JLabel();
        btn_prev2 = new javax.swing.JButton();
        btn_next2 = new javax.swing.JButton();
        btn_last2 = new javax.swing.JButton();
        lbl_tongSoTrang2 = new javax.swing.JLabel();
        lbl_thongBao_SPCT2 = new javax.swing.JLabel();
        tbp_TTSP = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_maThuocTinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tenThuocTinh = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        rdo_kichThuoc = new javax.swing.JRadioButton();
        rdo_chatLieu = new javax.swing.JRadioButton();
        rdo_mauSac = new javax.swing.JRadioButton();
        rdo_thuongHieu = new javax.swing.JRadioButton();
        rdo_deGiay = new javax.swing.JRadioButton();
        rdo_dayGiay = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        btn_themTTSP = new javax.swing.JButton();
        btn_suaTTSP = new javax.swing.JButton();
        btn_lamMoiTTSP = new javax.swing.JButton();
        btn_xoaTTSP = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_TTSP = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        jpn_tblSPCT.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sản Phẩm Chi Tiết"));
        jpn_tblSPCT.setFocusTraversalPolicyProvider(true);
        jpn_tblSPCT.setPreferredSize(new java.awt.Dimension(1180, 380));
        jpn_tblSPCT.setRequestFocusEnabled(false);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1180, 293));

        tbl_SPCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên Sản Phẩm", "Mã SPCT", "Thương Hiệu", "Kích Cỡ", "Màu Sắc", "Chất Liệu", "Đế Giày", "Dây Giày", "Số Lượng Tồn", "Giá Bán"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    tbl_SPCT.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_SPCTMouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(tbl_SPCT);

    rdo_HienThi_ALL_SPCT.setText("Hiển thị tất cả sản phẩm ");
    rdo_HienThi_ALL_SPCT.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_HienThi_ALL_SPCTActionPerformed(evt);
        }
    });

    txt_timKiemSPCT.setBackground(new java.awt.Color(242, 242, 242));
    txt_timKiemSPCT.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
    txt_timKiemSPCT.setForeground(java.awt.Color.gray);
    txt_timKiemSPCT.setText("Tìm kiếm SPCT theo Mã SPCT , tên , thuộc tính ..... ");
    txt_timKiemSPCT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));
    txt_timKiemSPCT.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txt_timKiemSPCTFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_timKiemSPCTFocusLost(evt);
        }
    });
    txt_timKiemSPCT.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_timKiemSPCTKeyReleased(evt);
        }
    });

    btn_first.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_firstActionPerformed(evt);
        }
    });

    lbl_trang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbl_trang.setText("trang");

    btn_prev.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_prevActionPerformed(evt);
        }
    });

    btn_next.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_nextActionPerformed(evt);
        }
    });

    btn_last.setPreferredSize(new java.awt.Dimension(43, 31));
    btn_last.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_lastActionPerformed(evt);
        }
    });

    lbl_tongSoTrang.setBackground(new java.awt.Color(255, 255, 255));
    lbl_tongSoTrang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbl_tongSoTrang.setText("tongSoTrang");

    javax.swing.GroupLayout jpn_tblSPCTLayout = new javax.swing.GroupLayout(jpn_tblSPCT);
    jpn_tblSPCT.setLayout(jpn_tblSPCTLayout);
    jpn_tblSPCTLayout.setHorizontalGroup(
        jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_tblSPCTLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_tblSPCTLayout.createSequentialGroup()
                    .addComponent(txt_timKiemSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 697, Short.MAX_VALUE)
                    .addComponent(rdo_HienThi_ALL_SPCT))
                .addGroup(jpn_tblSPCTLayout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())))
        .addGroup(jpn_tblSPCTLayout.createSequentialGroup()
            .addGap(360, 360, 360)
            .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39)
            .addComponent(lbl_trang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38)
            .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(lbl_tongSoTrang)
            .addGap(18, 18, 18)
            .addComponent(lbl_thongBao_SPCT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 137, Short.MAX_VALUE))
    );
    jpn_tblSPCTLayout.setVerticalGroup(
        jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_tblSPCTLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdo_HienThi_ALL_SPCT)
                .addComponent(txt_timKiemSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_trang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpn_tblSPCTLayout.createSequentialGroup()
                    .addGroup(jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_tblSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_tongSoTrang)
                                .addComponent(lbl_thongBao_SPCT)))
                        .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    tbp.setPreferredSize(new java.awt.Dimension(1210, 762));

    tbp_SP.setPreferredSize(new java.awt.Dimension(1210, 687));

    jpn_TTSP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Thông tin sản phẩm"));
    jpn_TTSP.setPreferredSize(new java.awt.Dimension(390, 687));

    jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel1.setText("Mã Sản Phẩm : ");
    jLabel1.setPreferredSize(new java.awt.Dimension(97, 16));

    txt_maSP.setBackground(new java.awt.Color(242, 242, 242));
    txt_maSP.setForeground(java.awt.Color.lightGray);
    txt_maSP.setEnabled(false);
    txt_maSP.setPreferredSize(new java.awt.Dimension(230, 22));

    jLabel2.setText("Tên Sản Phẩm :");
    jLabel2.setPreferredSize(new java.awt.Dimension(97, 16));

    txt_tenSP.setBackground(new java.awt.Color(242, 242, 242));
    txt_tenSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
    txt_tenSP.setForeground(java.awt.Color.gray);
    txt_tenSP.setText("Nhập tên sản phẩm");
    txt_tenSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));
    txt_tenSP.setPreferredSize(new java.awt.Dimension(230, 22));
    txt_tenSP.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txt_tenSPFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_tenSPFocusLost(evt);
        }
    });

    jLabel17.setText("Trạng Thái SP :");
    jLabel17.setPreferredSize(new java.awt.Dimension(97, 16));

    cbb_trangThaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Kinh Doanh", "Dừng Kinh Doanh" }));
    cbb_trangThaiSP.setPreferredSize(new java.awt.Dimension(230, 22));

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
            .addGap(7, 7, 7)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txt_tenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_maSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbb_trangThaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_tenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(48, 48, 48)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cbb_trangThaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    jPanel10.setBackground(new java.awt.Color(255, 255, 255));
    jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh Minh Họa Sản Phẩm"));

    lbl_avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbl_avatar.setPreferredSize(new java.awt.Dimension(100, 286));

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel10Layout.createSequentialGroup()
            .addComponent(lbl_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel10Layout.setVerticalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel10Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl_avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Các Chức Năng"));
    jPanel2.setPreferredSize(new java.awt.Dimension(382, 52));

    btn_insert.setBackground(new java.awt.Color(204, 204, 255));
    btn_insert.setText("Thêm");
    btn_insert.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_insertActionPerformed(evt);
        }
    });

    btn_update.setBackground(new java.awt.Color(204, 204, 255));
    btn_update.setText("Cập Nhật");
    btn_update.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_updateActionPerformed(evt);
        }
    });

    btn_update1.setBackground(new java.awt.Color(204, 204, 255));
    btn_update1.setText("Làm Mới");
    btn_update1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_update1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
            .addComponent(btn_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_insert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update)
                    .addComponent(btn_update1)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Quá Trình Theo Dõi Sản Phẩm"));

    txt_nguoiTaoSP.setEnabled(false);
    txt_nguoiTaoSP.setPreferredSize(new java.awt.Dimension(230, 22));

    txt_nguoiSuaSP.setEnabled(false);
    txt_nguoiSuaSP.setPreferredSize(new java.awt.Dimension(230, 22));

    txt_ngayTaoSP.setEnabled(false);
    txt_ngayTaoSP.setPreferredSize(new java.awt.Dimension(230, 22));

    txt_ngayCapNhatSP.setEnabled(false);
    txt_ngayCapNhatSP.setPreferredSize(new java.awt.Dimension(230, 22));

    jLabel7.setText("Người Tạo SP :");
    jLabel7.setPreferredSize(new java.awt.Dimension(95, 16));

    jLabel8.setText("Người Chỉnh Sửa Cuối :");
    jLabel8.setPreferredSize(new java.awt.Dimension(95, 16));

    jLabel9.setText("Ngày Tạo :");
    jLabel9.setPreferredSize(new java.awt.Dimension(95, 16));

    jLabel10.setText("Ngày Cập Nhật Cuối :");
    jLabel10.setPreferredSize(new java.awt.Dimension(95, 16));

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txt_ngayTaoSP, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addComponent(txt_nguoiSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addComponent(txt_nguoiTaoSP, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addComponent(txt_ngayCapNhatSP, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
            .addGap(35, 35, 35))
    );
    jPanel11Layout.setVerticalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_nguoiTaoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_nguoiSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_ngayTaoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_ngayCapNhatSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(15, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jpn_TTSPLayout = new javax.swing.GroupLayout(jpn_TTSP);
    jpn_TTSP.setLayout(jpn_TTSPLayout);
    jpn_TTSPLayout.setHorizontalGroup(
        jpn_TTSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_TTSPLayout.createSequentialGroup()
            .addGroup(jpn_TTSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 14, Short.MAX_VALUE))
    );
    jpn_TTSPLayout.setVerticalGroup(
        jpn_TTSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_TTSPLayout.createSequentialGroup()
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(35, Short.MAX_VALUE))
    );

    jpn_DSSP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Danh Sách Sản Phẩm"));
    jpn_DSSP.setPreferredSize(new java.awt.Dimension(800, 687));

    jScrollPane1.setPreferredSize(new java.awt.Dimension(790, 560));

    tbl_dssp.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {"1", "SP01", "Nike Air Force 1", "10", "Active"},
            {"2", "SP02", "Adidas Stan Smith", "20", "Active"},
            {"3", "SP03", "Jordan 1 Retro", "30", "Active"},
            {"4", "SP04", "Converse Chuck Taylor All Star", "40", "Active"},
            {null, null, null, null, null}
        },
        new String [] {
            "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Trạng Thái"
        }
    )
    {
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }
    );
    tbl_dssp.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_dsspMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbl_dssp);

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Trạng Thái Hàng Hóa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

    rdo_dangKinhDoanh.setText("Đang Kinh Doanh");
    rdo_dangKinhDoanh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_dangKinhDoanhActionPerformed(evt);
        }
    });

    rdo_dungKinhDoanh.setText("Dừng Kinh Doanh");
    rdo_dungKinhDoanh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_dungKinhDoanhActionPerformed(evt);
        }
    });

    rdo_tatCa.setSelected(true);
    rdo_tatCa.setText("Tất Cả");
    rdo_tatCa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_tatCaActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(rdo_tatCa)
            .addGap(18, 18, 18)
            .addComponent(rdo_dangKinhDoanh)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(rdo_dungKinhDoanh)
            .addContainerGap(18, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdo_dangKinhDoanh)
                .addComponent(rdo_dungKinhDoanh)
                .addComponent(rdo_tatCa)))
    );

    jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Bộ lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

    txt_timKiemSP.setBackground(new java.awt.Color(242, 242, 242));
    txt_timKiemSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
    txt_timKiemSP.setForeground(java.awt.Color.gray);
    txt_timKiemSP.setText("Tìm kiếm sản phẩm theo mã sản phẩm , tên ....");
    txt_timKiemSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));
    txt_timKiemSP.setPreferredSize(new java.awt.Dimension(260, 22));
    txt_timKiemSP.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txt_timKiemSPFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_timKiemSPFocusLost(evt);
        }
    });
    txt_timKiemSP.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_timKiemSPKeyReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(txt_timKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addComponent(txt_timKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 6, Short.MAX_VALUE))
    );

    btn_firstSP.setText("<<");
    btn_firstSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_firstSPActionPerformed(evt);
        }
    });

    btn_prevSP.setText("<");
    btn_prevSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_prevSPActionPerformed(evt);
        }
    });

    lbl_trangSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbl_trangSP.setText("trang");

    btn_nextSP.setText(">");
    btn_nextSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_nextSPActionPerformed(evt);
        }
    });

    btn_lastSP.setText(">>");
    btn_lastSP.setPreferredSize(new java.awt.Dimension(43, 31));
    btn_lastSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_lastSPActionPerformed(evt);
        }
    });

    lbl_tongSoTrangSP.setBackground(new java.awt.Color(255, 255, 255));
    lbl_tongSoTrangSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbl_tongSoTrangSP.setText("tongSoTrang");

    javax.swing.GroupLayout jpn_DSSPLayout = new javax.swing.GroupLayout(jpn_DSSP);
    jpn_DSSP.setLayout(jpn_DSSPLayout);
    jpn_DSSPLayout.setHorizontalGroup(
        jpn_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_DSSPLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_firstSP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addComponent(btn_prevSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39)
            .addComponent(lbl_trangSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38)
            .addComponent(btn_nextSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btn_lastSP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lbl_tongSoTrangSP)
            .addGap(116, 116, 116))
        .addGroup(jpn_DSSPLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpn_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_DSSPLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpn_DSSPLayout.createSequentialGroup()
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42))))
    );
    jpn_DSSPLayout.setVerticalGroup(
        jpn_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_DSSPLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpn_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jpn_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_trangSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_firstSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_nextSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpn_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lastSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tongSoTrangSP))
                .addComponent(btn_prevSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(54, 54, 54))
    );

    javax.swing.GroupLayout tbp_SPLayout = new javax.swing.GroupLayout(tbp_SP);
    tbp_SP.setLayout(tbp_SPLayout);
    tbp_SPLayout.setHorizontalGroup(
        tbp_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(tbp_SPLayout.createSequentialGroup()
            .addComponent(jpn_TTSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jpn_DSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    tbp_SPLayout.setVerticalGroup(
        tbp_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jpn_TTSP, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        .addComponent(jpn_DSSP, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
    );

    tbp.addTab("Sản Phẩm", tbp_SP);

    tbp_SPCT.setPreferredSize(new java.awt.Dimension(1210, 687));

    jpn_SPCT.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sản Phẩm Chi Tiết"));
    jpn_SPCT.setPreferredSize(new java.awt.Dimension(1180, 300));

    jLabel3.setText("Tên Sản Phẩm ");

    cbb_tenSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cbb_tenSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbb_tenSPActionPerformed(evt);
        }
    });

    jLabel4.setText("Mã SPCT");

    txt_maSPCT.setEnabled(false);

    jLabel15.setText("Số Lượng Tồn ");

    txt_soLuong.setBackground(new java.awt.Color(242, 242, 242));
    txt_soLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));

    jLabel14.setText("Giá Bán");

    txt_giaBan.setBackground(new java.awt.Color(242, 242, 242));
    txt_giaBan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));

    jLabel13.setText("Mô Tả");

    ta_moTa.setColumns(20);
    ta_moTa.setRows(5);
    jScrollPane2.setViewportView(ta_moTa);

    btn_congTenSP.setBackground(new java.awt.Color(204, 204, 255));
    btn_congTenSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_congTenSPActionPerformed(evt);
        }
    });

    jTextField1.setBackground(new java.awt.Color(242, 242, 242));
    jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jTextField1.setText("(Nghìn)");
    jTextField1.setEnabled(false);

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txt_soLuong))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txt_maSPCT))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(cbb_tenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_congTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_giaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btn_congTenSP)
                .addComponent(cbb_tenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_maSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_giaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel16.setPreferredSize(new java.awt.Dimension(440, 30));

    cbb_thuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel21.setText("Thương Hiệu");

    btn_congThuongHieu.setBackground(new java.awt.Color(204, 204, 255));
    btn_congThuongHieu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_congThuongHieuActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
    jPanel16.setLayout(jPanel16Layout);
    jPanel16Layout.setHorizontalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_thuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_congThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel16Layout.setVerticalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel16Layout.createSequentialGroup()
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_thuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btn_congThuongHieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addContainerGap())
    );

    jPanel17.setPreferredSize(new java.awt.Dimension(440, 30));

    cbb_kichThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel22.setText("Kích Thước");

    btn_congKichThuoc.setBackground(new java.awt.Color(204, 204, 255));
    btn_congKichThuoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_congKichThuocActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
    jPanel17.setLayout(jPanel17Layout);
    jPanel17Layout.setHorizontalGroup(
        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_kichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_congKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel17Layout.setVerticalGroup(
        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel17Layout.createSequentialGroup()
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_kichThuoc))
                .addComponent(btn_congKichThuoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addContainerGap())
    );

    jPanel18.setPreferredSize(new java.awt.Dimension(440, 30));

    cbb_mauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel23.setText("Màu Sắc");

    btn_congMauSac.setBackground(new java.awt.Color(204, 204, 255));
    btn_congMauSac.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_congMauSacActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_mauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_congMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_mauSac))
                .addComponent(btn_congMauSac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addContainerGap())
    );

    jPanel19.setPreferredSize(new java.awt.Dimension(440, 30));

    cbb_chatLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel24.setText("Chất Liệu");

    cbb_congChatLieu.setBackground(new java.awt.Color(204, 204, 255));
    cbb_congChatLieu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbb_congChatLieuActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
    jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_chatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_congChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel19Layout.setVerticalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel19Layout.createSequentialGroup()
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_chatLieu))
                .addComponent(cbb_congChatLieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addContainerGap())
    );

    jPanel20.setPreferredSize(new java.awt.Dimension(440, 30));

    cbb_deGiay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel25.setText("Đế Giày");

    btn_congDeGiay.setBackground(new java.awt.Color(204, 204, 255));
    btn_congDeGiay.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_congDeGiayActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
    jPanel20.setLayout(jPanel20Layout);
    jPanel20Layout.setHorizontalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_deGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_congDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel20Layout.setVerticalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel20Layout.createSequentialGroup()
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_deGiay))
                .addComponent(btn_congDeGiay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addContainerGap())
    );

    jPanel21.setPreferredSize(new java.awt.Dimension(440, 30));

    cbb_dayGiay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel26.setText("Dây Giày");

    btn_congDayGiay.setBackground(new java.awt.Color(204, 204, 255));
    btn_congDayGiay.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_congDayGiayActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_dayGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
            .addComponent(btn_congDayGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel21Layout.setVerticalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_dayGiay))
                .addComponent(btn_congDayGiay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    btn_themSPCT.setBackground(new java.awt.Color(204, 204, 255));
    btn_themSPCT.setText("Thêm SPCT");
    btn_themSPCT.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_themSPCTActionPerformed(evt);
        }
    });

    btn_CapNhatSP.setBackground(new java.awt.Color(204, 204, 255));
    btn_CapNhatSP.setText("Cập Nhật Sản Phẩm");
    btn_CapNhatSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_CapNhatSPActionPerformed(evt);
        }
    });

    btn_lamMoiSPCT.setBackground(new java.awt.Color(204, 204, 255));
    btn_lamMoiSPCT.setText("Làm Mới");
    btn_lamMoiSPCT.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_lamMoiSPCTActionPerformed(evt);
        }
    });

    btn_xuatFileExcel.setBackground(new java.awt.Color(204, 204, 255));
    btn_xuatFileExcel.setText("Xuất File Excel");
    btn_xuatFileExcel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_xuatFileExcelActionPerformed(evt);
        }
    });

    btn_xoaSPCT.setBackground(new java.awt.Color(204, 204, 255));
    btn_xoaSPCT.setText("Xóa");
    btn_xoaSPCT.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_xoaSPCTActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(btn_xuatFileExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_CapNhatSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_themSPCT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_lamMoiSPCT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_xoaSPCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(btn_themSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btn_CapNhatSP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btn_lamMoiSPCT)
            .addGap(18, 18, 18)
            .addComponent(btn_xoaSPCT)
            .addGap(18, 18, 18)
            .addComponent(btn_xuatFileExcel)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jpn_SPCTLayout = new javax.swing.GroupLayout(jpn_SPCT);
    jpn_SPCT.setLayout(jpn_SPCTLayout);
    jpn_SPCTLayout.setHorizontalGroup(
        jpn_SPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_SPCTLayout.createSequentialGroup()
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(63, 63, 63)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(145, Short.MAX_VALUE))
    );
    jpn_SPCTLayout.setVerticalGroup(
        jpn_SPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_SPCTLayout.createSequentialGroup()
            .addGroup(jpn_SPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 37, Short.MAX_VALUE))
    );

    jpn_tblSPCT3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sản Phẩm Chi Tiết"));
    jpn_tblSPCT3.setFocusTraversalPolicyProvider(true);
    jpn_tblSPCT3.setPreferredSize(new java.awt.Dimension(1180, 380));
    jpn_tblSPCT3.setRequestFocusEnabled(false);

    jScrollPane8.setPreferredSize(new java.awt.Dimension(1180, 293));

    tbl_SPCT4.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "STT", "Tên Sản Phẩm", "Mã SPCT", "Thương Hiệu", "Kích Cỡ", "Màu Sắc", "Chất Liệu", "Đế Giày", "Dây Giày", "Số Lượng Tồn", "Giá Bán"
        }
    )
    {
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }
    );
    tbl_SPCT4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_SPCT4MouseClicked(evt);
        }
    });
    jScrollPane8.setViewportView(tbl_SPCT4);

    rdo_HienThi_ALL_SPCT2.setText("Hiển thị tất cả sản phẩm ");
    rdo_HienThi_ALL_SPCT2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_HienThi_ALL_SPCT2ActionPerformed(evt);
        }
    });

    txt_timKiemSPCT2.setBackground(new java.awt.Color(242, 242, 242));
    txt_timKiemSPCT2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
    txt_timKiemSPCT2.setForeground(java.awt.Color.gray);
    txt_timKiemSPCT2.setText("Tìm kiếm SPCT theo Mã SPCT , tên , thuộc tính ..... ");
    txt_timKiemSPCT2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));
    txt_timKiemSPCT2.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txt_timKiemSPCT2FocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_timKiemSPCT2FocusLost(evt);
        }
    });
    txt_timKiemSPCT2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_timKiemSPCT2KeyReleased(evt);
        }
    });

    btn_first2.setText("<<");
    btn_first2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_first2ActionPerformed(evt);
        }
    });

    lbl_trang2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbl_trang2.setText("trang");

    btn_prev2.setText("<");
    btn_prev2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_prev2ActionPerformed(evt);
        }
    });

    btn_next2.setText(">");
    btn_next2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_next2ActionPerformed(evt);
        }
    });

    btn_last2.setText(">>");
    btn_last2.setPreferredSize(new java.awt.Dimension(43, 31));
    btn_last2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_last2ActionPerformed(evt);
        }
    });

    lbl_tongSoTrang2.setBackground(new java.awt.Color(255, 255, 255));
    lbl_tongSoTrang2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbl_tongSoTrang2.setText("tongSoTrang");

    javax.swing.GroupLayout jpn_tblSPCT3Layout = new javax.swing.GroupLayout(jpn_tblSPCT3);
    jpn_tblSPCT3.setLayout(jpn_tblSPCT3Layout);
    jpn_tblSPCT3Layout.setHorizontalGroup(
        jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_tblSPCT3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_tblSPCT3Layout.createSequentialGroup()
                    .addComponent(txt_timKiemSPCT2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 697, Short.MAX_VALUE)
                    .addComponent(rdo_HienThi_ALL_SPCT2))
                .addGroup(jpn_tblSPCT3Layout.createSequentialGroup()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())))
        .addGroup(jpn_tblSPCT3Layout.createSequentialGroup()
            .addGap(353, 353, 353)
            .addComponent(btn_first2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addComponent(btn_prev2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39)
            .addComponent(lbl_trang2)
            .addGap(28, 28, 28)
            .addComponent(btn_next2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btn_last2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lbl_tongSoTrang2)
            .addGap(18, 18, 18)
            .addComponent(lbl_thongBao_SPCT2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 137, Short.MAX_VALUE))
    );
    jpn_tblSPCT3Layout.setVerticalGroup(
        jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpn_tblSPCT3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdo_HienThi_ALL_SPCT2)
                .addComponent(txt_timKiemSPCT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_trang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpn_tblSPCT3Layout.createSequentialGroup()
                    .addGroup(jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_first2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_next2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_last2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_tblSPCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_tongSoTrang2)
                                .addComponent(lbl_thongBao_SPCT2)))
                        .addComponent(btn_prev2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );

    javax.swing.GroupLayout tbp_SPCTLayout = new javax.swing.GroupLayout(tbp_SPCT);
    tbp_SPCT.setLayout(tbp_SPCTLayout);
    tbp_SPCTLayout.setHorizontalGroup(
        tbp_SPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(tbp_SPCTLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(tbp_SPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpn_tblSPCT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jpn_SPCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(24, Short.MAX_VALUE))
    );
    tbp_SPCTLayout.setVerticalGroup(
        tbp_SPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(tbp_SPCTLayout.createSequentialGroup()
            .addComponent(jpn_SPCT, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jpn_tblSPCT3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    tbp.addTab("Sẩn Phẩm Chi Tiết", tbp_SPCT);

    tbp_TTSP.setPreferredSize(new java.awt.Dimension(1210, 722));

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Thông tin thuộc tính"));

    jLabel5.setText("Mã Thuộc Tính");

    txt_maThuocTinh.setEnabled(false);

    jLabel6.setText("Tên Thuộc Tính");

    txt_tenThuocTinh.setBackground(new java.awt.Color(242, 242, 242));
    txt_tenThuocTinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txt_tenThuocTinh))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txt_maThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(55, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txt_maThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5))
            .addGap(34, 34, 34)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(txt_tenThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(27, Short.MAX_VALUE))
    );

    jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Danh sách thuộc tính"));

    rdo_kichThuoc.setSelected(true);
    rdo_kichThuoc.setText("Kích Thước");
    rdo_kichThuoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_kichThuocActionPerformed(evt);
        }
    });

    rdo_chatLieu.setText("Chất Liệu");
    rdo_chatLieu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_chatLieuActionPerformed(evt);
        }
    });

    rdo_mauSac.setText("Màu Sắc");
    rdo_mauSac.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_mauSacActionPerformed(evt);
        }
    });

    rdo_thuongHieu.setText("Thương Hiệu");
    rdo_thuongHieu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_thuongHieuActionPerformed(evt);
        }
    });

    rdo_deGiay.setText("Đế Giày");
    rdo_deGiay.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_deGiayActionPerformed(evt);
        }
    });

    rdo_dayGiay.setText("Dây Giày");
    rdo_dayGiay.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rdo_dayGiayActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGap(64, 64, 64)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(rdo_thuongHieu)
                    .addGap(32, 32, 32)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rdo_chatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdo_deGiay)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdo_mauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(rdo_kichThuoc)
                        .addGap(152, 152, 152)
                        .addComponent(rdo_dayGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel9Layout.setVerticalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdo_kichThuoc)
                .addComponent(rdo_chatLieu)
                .addComponent(rdo_mauSac))
            .addGap(18, 18, 18)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdo_thuongHieu)
                .addComponent(rdo_dayGiay)
                .addComponent(rdo_deGiay))
            .addContainerGap(20, Short.MAX_VALUE))
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "chức năng"));

    btn_themTTSP.setBackground(new java.awt.Color(204, 204, 255));
    btn_themTTSP.setText("Thêm");
    btn_themTTSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_themTTSPActionPerformed(evt);
        }
    });

    btn_suaTTSP.setBackground(new java.awt.Color(204, 204, 255));
    btn_suaTTSP.setText("Sửa");
    btn_suaTTSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_suaTTSPActionPerformed(evt);
        }
    });

    btn_lamMoiTTSP.setBackground(new java.awt.Color(204, 204, 255));
    btn_lamMoiTTSP.setText("Làm Mới");
    btn_lamMoiTTSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_lamMoiTTSPActionPerformed(evt);
        }
    });

    btn_xoaTTSP.setBackground(new java.awt.Color(204, 204, 255));
    btn_xoaTTSP.setText("Xóa");
    btn_xoaTTSP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_xoaTTSPActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(btn_themTTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addComponent(btn_suaTTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btn_xoaTTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_lamMoiTTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_themTTSP)
                .addComponent(btn_suaTTSP)
                .addComponent(btn_lamMoiTTSP)
                .addComponent(btn_xoaTTSP))
            .addContainerGap(28, Short.MAX_VALUE))
    );

    jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Bảng dánh sách các thuộc tính"));

    tbl_TTSP.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "Mã Thuộc Tính", "Tên Thuộc Tính"
        }
    )
    {
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }
    );
    tbl_TTSP.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_TTSPMouseClicked(evt);
        }
    });
    jScrollPane9.setViewportView(tbl_TTSP);

    jTabbedPane1.addTab("Thuộc Tính Sử Dụng", jScrollPane9);

    javax.swing.GroupLayout tbp_TTSPLayout = new javax.swing.GroupLayout(tbp_TTSP);
    tbp_TTSP.setLayout(tbp_TTSPLayout);
    tbp_TTSPLayout.setHorizontalGroup(
        tbp_TTSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(tbp_TTSPLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(tbp_TTSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(66, Short.MAX_VALUE))
    );
    tbp_TTSPLayout.setVerticalGroup(
        tbp_TTSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(tbp_TTSPLayout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(tbp_TTSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(tbp_TTSPLayout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(306, Short.MAX_VALUE))
    );

    tbp.addTab("Thuộc Tính Sản Phẩm", tbp_TTSP);

    jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel11.setText("        Danh Mục Sản Phẩm              ");
    jLabel11.setPreferredSize(new java.awt.Dimension(1210, 28));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 44, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(81, 81, 81))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_SPCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SPCTMouseClicked
        int rowSelected = this.tbl_SPCT4.getSelectedRow();
        if (dtmDSSPCT.getRowCount() > 0 && evt.getClickCount() == 2) { //rowCount thực tế là đếm số đối tượng ở mỗi dòng trên bảng.
            int ID_SPCT = Integer.valueOf(this.tbl_SPCT4.getValueAt(rowSelected, 2).toString().substring(5));
            Ispct spct = prdd.selectById_To_ThemNhanh(ID_SPCT);//thực hiện truy vấn 1 spct dựa theo ID_SPCT chọn trên bảng
            JDiaLogUpdateSPCT dialog = new JDiaLogUpdateSPCT(spct); //Tạo đối tượng
            dialog.addWindowListener(new WindowAdapter() {//Đăng ký các sự kiện thực hiện khi đóng JDiaLOg.
                @Override
                public void windowClosed(WindowEvent e) {
                    // Xử lý khi cửa sổ JDiaLog đóng ( disposed )
                    //Dựa vào tên sp update thì thực hiện fill lại sản phẩm chi tiết ở số trang đó;
                    if (!rdo_HienThi_ALL_SPCT.isSelected()) {
                        Trang = Integer.valueOf(lbl_trang.getText());
                        Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                        setCustomRenderer(tbl_SPCT4, rowSelected);
                    } else {
                        fill_ALL_SPCT_To_Table();
                        setCustomRenderer(tbl_SPCT4, rowSelected);
                    }
                }
            });
            dialog.setVisible(true); //khởi tạo giao diện r nó sẽ chạy xuống dưới nếu có
        } else if (evt.getClickCount() == 1) {//Khi oneClick vào 1 đối tượng trên bảng thì đẩy thông tin đối tượng đó lên các thành phần
            Ispct spct = prdd.selectById_To_ThemNhanh(Integer.valueOf(this.tbl_SPCT.getValueAt(rowSelected, 2).toString().substring(5)));
            txt_maSPCT.setText(String.valueOf(spct.getId()));
            txt_soLuong.setText(String.valueOf(spct.getSoLuong()));
            txt_giaBan.setText(String.valueOf(formatNumber_BoDauCham(spct.getGiaBan())));
            ta_moTa.setText(spct.getMoTa());
            cbb_thuongHieu.setSelectedItem(spct.getNamethuongHieu());
            cbb_kichThuoc.setSelectedItem(Integer.valueOf(spct.getNamekichCo().trim()));//Kiểu cbb_kichThuoc là java.lang.Integer nên cẩn chuyển lại cho phù hợp.Thì giờ cần phải valida kích thước là number ko thì Excep ko ép đc kiểu thành Integer.
            cbb_mauSac.setSelectedItem(spct.getNamemauSac());
            cbb_chatLieu.setSelectedItem(spct.getNamechatLieu());
            cbb_deGiay.setSelectedItem(spct.getNamedeGiay());
            cbb_dayGiay.setSelectedItem(spct.getNamedayGiay());

            //            dcbThuongHieu.setSelectedItem(spct.getNamethuongHieu());dcbKichThuoc.setSelectedItem(spct.getNamekichCo());dcbMauSac.setSelectedItem(spct.getNamemauSac());dcbChatLieu.setSelectedItem(spct.getNamechatLieu());dcbDeGiay.setSelectedItem(spct.getNamedeGiay());dcbDayGiay.setSelectedItem(spct.getNamedayGiay());
            this.tbl_SPCT4.repaint(); //Thực hiện để xóa HighLight của bảng
            setCustomRenderer(this.tbl_SPCT4, -1); //Thực hiện thiết lập lại s.kiện HighLight.
        }
    }//GEN-LAST:event_tbl_SPCTMouseClicked

    private void rdo_HienThi_ALL_SPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_HienThi_ALL_SPCTActionPerformed
        if (rdo_HienThi_ALL_SPCT.isSelected()) {
            fill_ALL_SPCT_To_Table();
            thietLapHoatDongCho_BtnPhanTrang(false);
        } else {//nếu bỏ chọn thì thực hiện fill lại bảng các đối tượng theo trang đanh chọn.
            thietLapHoatDongCho_BtnPhanTrang(true);
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        }
    }//GEN-LAST:event_rdo_HienThi_ALL_SPCTActionPerformed

    public void thietLapHoatDongCho_BtnPhanTrang(boolean hoatDong) {//Tiện ích khi phân trang
        btn_next.setEnabled(hoatDong);
        btn_prev.setEnabled(hoatDong);
        btn_first.setEnabled(hoatDong);
        btn_last.setEnabled(hoatDong);
        String lbl_thongBao = (rdo_HienThi_ALL_SPCT.isSelected()) ? "Bỏ chọn hiện thị tất cả để chuyển trang" : "";
        lbl_thongBao_SPCT.setText(lbl_thongBao);
    }

    private void txt_timKiemSPCTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timKiemSPCTFocusGained
        //Sự kiện xảy ra khi thành phần txt_timKiemSP UI nhận đc trạng thái focus.
        if (txt_timKiemSPCT.getText().equals("Tìm kiếm SPCT theo Mã SPCT , tên , thuộc tính ..... ")) {
            txt_timKiemSPCT.setText(null);
            txt_timKiemSPCT.requestFocus();
            //remove placeholder style
            removePlaceholderStyle(txt_timKiemSPCT);
        }
    }//GEN-LAST:event_txt_timKiemSPCTFocusGained

    private void txt_timKiemSPCTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timKiemSPCTFocusLost
        //FocusLost : evt xảy ra khi compenent UI mất đi focus vào chính nó <=>  Focus ko vào thành phần khác ko phải nó
        if (txt_timKiemSPCT.getText().length() == 0) {
            //add Placeholder style
            addPlaceholderStyle(txt_timKiemSPCT);
            txt_timKiemSPCT.setText("Tìm kiếm SPCT theo Mã SPCT , tên , thuộc tính ..... ");
        }
    }//GEN-LAST:event_txt_timKiemSPCTFocusLost

    private void txt_timKiemSPCTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKiemSPCTKeyReleased
        //KeyReleased : evt xảy ra khi người dùng nhấn 1 phím và nhả nó ra.
        String searchString = txt_timKiemSPCT.getText();
        dtmDSSPCT = (DefaultTableModel) this.tbl_SPCT4.getModel();
        search(searchString, dtmDSSPCT, this.tbl_SPCT4);
    }//GEN-LAST:event_txt_timKiemSPCTKeyReleased

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        if (this.Trang > 1) {
            Trang = 1;
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        } else { //Trang <= 1
            MsgBox.alter(this, "Đã ở trang đầu tiên");
        }
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        //Thiết lập lại trang đang ở là :  trang và trang/tổng số trang.
        //Thực hiện truy vấn lại 5 đối tượng dựa theo số trang
        if (soTrang > 0) {
            if (this.Trang > 1) { //Trang là 4 thì chuyển xuống thành trang 3
                Trang--;
                lbl_trang.setText(String.valueOf(Trang));
                lbl_tongSoTrang.setText(Trang + "/" + soTrang);
                Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
            } else { //TH trang là 1 hoặc nhỏ hơn 1 thì về trang lớn nhất của nó
                Trang = soTrang; //Thì nếu số trang là 5 thì trang là 5.
                lbl_trang.setText(String.valueOf(Trang));
                lbl_tongSoTrang.setText(Trang + "/" + soTrang);
                Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
            }
        } else {
            MsgBox.alter(this, "Ko còn sản phẩm ko thể chuyển trang");
        }
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if (this.Trang < this.soTrang) { //Trang 3 nhỏ hơn tổng 5 số trang --> trang lên 4
            Trang++;
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        } else { //TH trang = số trang
            Trang = 1; //Thì nếu số trang là 5 thì sẽ về trang ban đầu là 1.
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        if (this.Trang < this.soTrang) { //
            Trang = soTrang;
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        } else { //TH trang = số trang
            MsgBox.alter(this, "Đã ở trang cuối cùng");
        }
    }//GEN-LAST:event_btn_lastActionPerformed

    private void txt_tenSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tenSPFocusGained
        //Sự kiện xảy ra khi thành phần txt_tenSP UI nhận đc trạng thái focus.
        if (txt_tenSP.getText().equals("Nhập tên sản phẩm")) {
            txt_tenSP.setText(null);
            txt_tenSP.requestFocus();
            //remove placeholder style
            removePlaceholderStyle(txt_tenSP);
        }
    }//GEN-LAST:event_txt_tenSPFocusGained

    private void txt_tenSPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tenSPFocusLost
        //Sự kiện xảy ra khi thành phần txt_tenSP UI nhận đc trạng thái focusLost.
        if (txt_tenSP.getText().length() == 0) {
            //add Placeholder style
            addPlaceholderStyle(txt_tenSP);
            txt_tenSP.setText("Nhập tên sản phẩm");
        }
    }//GEN-LAST:event_txt_tenSPFocusLost

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        //Thực hiện thêm SP
        String inputTenSP = txt_tenSP.getText().trim();
        boolean confirmThemSP = MsgBox.confirm(this, "thực hiện thêm SP");
        if (confirmThemSP && checkNull(inputTenSP) && checkKhongTonTaiChoSP(inputTenSP) && checkKhongLaSo_KyTuDacBiet(inputTenSP) && checkTenSP_KhongDaiQua30(inputTenSP)) {
            TenGiay tg = getTenSPInsert(inputTenSP);
            if (prd.insert(tg) != 0) {
                if (!rdo_tatCa.isSelected()) {//Nếu tất cả đag chọn. Fill cái insert lên đầu.
                    rdo_dangKinhDoanh.setSelected(tg.getStatus().equals("Đang Kinh Doanh"));
                    rdo_dungKinhDoanh.setSelected(tg.getStatus().equals("Dừng Kinh Doanh"));
                }
                MsgBox.alter(this, "Thêm SP Thành Công");
                if (rdo_tatCa.isSelected()) {//Thực hiện cập nhật lại số trang khi thêm. Và hiện thị là trang cuối
                    CountSoTrangSP();
                    TrangSP = 1;
                    lbl_tongSoTrangSP.setText(String.valueOf(TrangSP + "/" + soTrangSP));
                    lbl_trangSP.setText(String.valueOf(TrangSP));
                    //------------
                    List<TenGiay> listTG = prd.getTop5SP(TrangSP); //Lấy danh sách 5 Obj : Vs ngày tạo giảm dần.
                    Model_fill_SP_To_Table(listTG);          // Đổ danh sách đó lên bảng.
                    setQuaTrinhTheoDoiSP(Integer.valueOf(tbl_dssp.getValueAt(0, 1).toString().substring(5)));
                    setCustomRenderer(this.tbl_dssp, 0);
                } else if (rdo_dangKinhDoanh.isSelected()) {
                    CountSoTrangSPTheoTrangThaiDePhanTrang("Đang Kinh Doanh");
                    TrangSP = 1;
                    lbl_tongSoTrangSP.setText(String.valueOf(TrangSP + "/" + soTrangSP));
                    lbl_trangSP.setText(String.valueOf(TrangSP));
                    //------------
                    List<TenGiay> listTG = prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP); //thực hiện truy vấn sản phẩm theo trạng thái
                    Model_fill_SP_To_Table(listTG);
                    setQuaTrinhTheoDoiSP(Integer.valueOf(tbl_dssp.getValueAt(0, 1).toString().substring(5)));
                    setCustomRenderer(this.tbl_dssp, 0);
                } else {
                    CountSoTrangSPTheoTrangThaiDePhanTrang("Dừng Kinh Doanh");
                    TrangSP = 1;
                    lbl_tongSoTrangSP.setText(String.valueOf(TrangSP + "/" + soTrangSP));
                    lbl_trangSP.setText(String.valueOf(TrangSP));
                    //------------
                    List<TenGiay> listTG = prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP); //thực hiện truy vấn sản phẩm theo trạng thái
                    Model_fill_SP_To_Table(listTG);
                    setQuaTrinhTheoDoiSP(Integer.valueOf(tbl_dssp.getValueAt(0, 1).toString().substring(5)));
                    setCustomRenderer(this.tbl_dssp, 0);
                }
            } else {
                MsgBox.alter(this, "Thêm sản phẩm thất bại");
            }
        } else if (!confirmThemSP) {
            MsgBox.alter(this, "Hủy thao tác thêm");
        } else if (!checkNull(inputTenSP)) {
            MsgBox.alter(this, "Yêu cầu nhập tên SP để thêm");
        } else if (!checkKhongTonTaiChoSP(inputTenSP)) {
            MsgBox.alter(this, "Tên SP " + inputTenSP + " đã tồn tại");
        } else if (!checkTenSP_KhongDaiQua30(inputTenSP)) {
            MsgBox.alter(this, "Tên SP ko dài quá 30 ký tự");
        } else if (!checkKhongLaSo_KyTuDacBiet(inputTenSP)) {
            MsgBox.alter(this, "Tên SP phải là chữ và có khoảng trắng.Không được chứa ký tự đặc biệt.");
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int rowSelected = this.tbl_dssp.getSelectedRow();
        boolean confirmUpdateSP = MsgBox.confirm(this, "Cập nhật sản phẩm");
        String inputTenSP = txt_tenSP.getText().trim(); //lấy tên SP nhập vào.
        String checkcbb_trangThaiSP = this.cbb_trangThaiSP.getSelectedItem().toString().trim();//check xem nếu cập nhật lại trạng thái thì xem trang thái cập nhật lại có trùng không.
        //----------------
        if (rowSelected != -1 && confirmUpdateSP && checkNull(inputTenSP) && checkKhongLaSo_KyTuDacBiet(inputTenSP) && checkTenSP_KhongDaiQua30(inputTenSP)) {
            int ID_TenGiay_Selected_OnTable = Integer.valueOf(this.tbl_dssp.getValueAt(rowSelected, 1).toString().substring(5));//Lấy id đối tượng đang được chọn.
            //kiểm tra xem nó có trùng tên sp và trạng thái ko. Nếu trùng cả 2 thì là false false
            if (checkKhongTonTaiChoSP(inputTenSP) || checkKhongTrungTrangThai(rowSelected, checkcbb_trangThaiSP)) {
                TenGiay tg = getTenSPUpdate(ID_TenGiay_Selected_OnTable); //Lấy 1 đói tượng chứa : thông tin cần + id_tenGiay update
                if (prd.update(tg) == 1) {//khi có thực hiện update
                    if (!rdo_tatCa.isSelected()) { //Dựa vào trạng thái cập nhật để chuyển rdo cho đúng.
                        rdo_dangKinhDoanh.setSelected(tg.getStatus().equals("Đang Kinh Doanh"));
                        rdo_dungKinhDoanh.setSelected(tg.getStatus().equals("Dừng Kinh Doanh"));
                    }
                    if (rdo_tatCa.isSelected() && dtmDSSP.getRowCount() > 0) {//Dựa vào rdo đang chọn để khi Update fill lại cho phù hợp
                        int TrangDangChonDeUpdate = Integer.valueOf(lbl_trangSP.getText().trim());
                        List<TenGiay> listTG = prd.getTop5SP(TrangDangChonDeUpdate); //Lấy danh sách tất cả SP ở trang thực hiện Update
                        Model_fill_SP_To_Table(listTG);          // Đổ danh sách đó lên bảng.
                        setQuaTrinhTheoDoiSP(Integer.valueOf(this.tbl_dssp.getValueAt(rowSelected, 1).toString().substring(5)));
                        setCustomRenderer(this.tbl_dssp, rowSelected);
                    } else if (rdo_dangKinhDoanh.isSelected() && dtmDSSP.getRowCount() > 0) {
                        CountSoTrangSPTheoTrangThaiDePhanTrang("Đang Kinh Doanh");
                        TrangSP = 1;
                        lbl_tongSoTrangSP.setText(String.valueOf(TrangSP + "/" + soTrangSP));
                        lbl_trangSP.setText(String.valueOf(TrangSP));
                        Model_fill_SP_To_Table(prd.selectTop5_SP_TheoTimeUpdate_GiamDan("Đang Kinh Doanh", TrangSP));//Khi  thực hiện udpate xog thì cho nó quay về trang đầu.
                        setQuaTrinhTheoDoiSP(Integer.valueOf(this.tbl_dssp.getValueAt(0, 1).toString().substring(5)));
                        setCustomRenderer(this.tbl_dssp, 0);
                    } else if (rdo_dungKinhDoanh.isSelected() && dtmDSSP.getRowCount() > 0) {
                        CountSoTrangSPTheoTrangThaiDePhanTrang("Dừng Kinh Doanh"); //khi cập nhật cx đếm lại số trang
                        TrangSP = 1;
                        lbl_tongSoTrangSP.setText(String.valueOf(TrangSP + "/" + soTrangSP));
                        lbl_trangSP.setText(String.valueOf(TrangSP));
                        Model_fill_SP_To_Table(prd.selectTop5_SP_TheoTimeUpdate_GiamDan("Dừng Kinh Doanh", TrangSP));
                        setQuaTrinhTheoDoiSP(Integer.valueOf(this.tbl_dssp.getValueAt(0, 1).toString().substring(5)));
                        setCustomRenderer(this.tbl_dssp, 0);
                    }
                    MsgBox.alter(this, "cập nhật SP thành công");
                } else {
                    MsgBox.alter(this, "cập nhật sản phẩm thất bại");
                }
            } else {
                MsgBox.alter(this, "Thực hiện cập nhật 'tên sản phẩm' hoặc 'trạng thái sản phẩm' để thực hiện cập nhật!");
            }
        } else if (!confirmUpdateSP) {
            MsgBox.alter(this, "Hủy cập nhật SP ");
        } else if (rowSelected == -1) {
            MsgBox.alter(this, "Yêu cầu chọn dòng để cập nhật");
        } else if (!checkNull(inputTenSP)) {
            MsgBox.alter(this, "yêu cầu nhập tên SP để thực hiện cập nhật");
        } else if (!checkTenSP_KhongDaiQua30(inputTenSP)) {
            MsgBox.alter(this, "Tên SP ko dài quá 30 ký tự");
        } else if (!checkKhongLaSo_KyTuDacBiet(inputTenSP)) {
            MsgBox.alter(this, "Tên SP phải là chữ và có khoảng trắng.Không được chứa ký tự đặc biệt.");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        clearSP();
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void tbl_dsspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dsspMouseClicked
        //Thực hiện chuyển TabbedPane khi thực hiện chọn 1 đối tượng trong JTable DSSP
        int rowSelected = this.tbl_dssp.getSelectedRow(); //Dòng đc chọn
        if (dtmDSSP.getRowCount() > 0) {
            if (evt.getClickCount() == 1) {
                removePlaceholderStyle(txt_tenSP);//Xóa bỏ phông chữ trắng đi cho JTextField Tên SP
                //--------------------------------------------------------------Thực hiện lấy dữ liệu ở đối tượng fill lên các textField
                int id_SP = Integer.valueOf(this.tbl_dssp.getValueAt(rowSelected, 1).toString().substring(5)); //ID của sản phẩm chọn trên bảng.
                txt_maSP.setText(tbl_dssp.getValueAt(rowSelected, 1).toString());
                txt_tenSP.setText(this.tbl_dssp.getValueAt(rowSelected, 2).toString());
                cbb_trangThaiSP.setSelectedItem(this.tbl_dssp.getValueAt(rowSelected, 4));
                setQuaTrinhTheoDoiSP(id_SP); //Fill thông tin lên phần Theo Quá Trình Tác Động lên bảng.
                //--------------------------------------------------------------Thực hiện dựa vào ID_maSP lấy ra ảnh spct có sl nhiều nhất fill lên.
                getName_ImageIcon_By_IDSP_With_SPCT_MaxQuantity(Integer.valueOf(this.tbl_dssp.getValueAt(rowSelected, 1).toString().substring(5)));
                //------------------------------------------Thực hiện xóa HighLight của JTable và highLight dòng đc chọn
                this.tbl_dssp.repaint(); //Thực hiện để xóa HighLight của bảng
                setCustomRenderer(this.tbl_dssp, -1); //Thực hiện thiết lập lại s.kiện HighLight.
            } else if (evt.getClickCount() == 2) {
                //Cách mới  : Dựa vào tên SP đc chọn ở tbl_dssp mà cho dcbmdTenSP đc chọn Tên SP đó thì fill ra các SPCT của SP đó.
                String tenSP_Selected = this.tbl_dssp.getValueAt(rowSelected, 2).toString().trim();
                dcbmdTenSP.setSelectedItem(tenSP_Selected);
                //Khi từ giao diện SP chuyển sang giao diện SPCT thì các trường dữ liệu phải là trống.
                clearSPCT();
                tbp.setSelectedComponent(tbp_SPCT);//Chuyển JTabbed Pane Sang giao diện SPCT
            }
        }
    }//GEN-LAST:event_tbl_dsspMouseClicked

    private void rdo_dangKinhDoanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_dangKinhDoanhActionPerformed
        CountSoTrangSPTheoTrangThaiDePhanTrang("Đang Kinh Doanh");//Thực hiện đếm số trang
        TrangSP = 1;
        lbl_tongSoTrangSP.setText(String.valueOf(TrangSP + "/" + soTrangSP));
        lbl_trangSP.setText("1");
        List<TenGiay> listTG = prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP); //thực hiện truy vấn sản phẩm theo trạng thái
        Model_fill_SP_To_Table(listTG);
    }//GEN-LAST:event_rdo_dangKinhDoanhActionPerformed

    private void rdo_dungKinhDoanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_dungKinhDoanhActionPerformed
        CountSoTrangSPTheoTrangThaiDePhanTrang("Dừng Kinh Doanh");//Thực hiện đếm số trang
        TrangSP = 1;
        lbl_tongSoTrangSP.setText(String.valueOf(TrangSP + "/" + soTrangSP));
        lbl_trangSP.setText("1");
        List<TenGiay> listTG = prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP); //thực hiện truy vấn sản phẩm theo trạng thái
        Model_fill_SP_To_Table(listTG);
    }//GEN-LAST:event_rdo_dungKinhDoanhActionPerformed

    private void rdo_tatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_tatCaActionPerformed
        fill_SP_To_Table();
    }//GEN-LAST:event_rdo_tatCaActionPerformed

    private void txt_timKiemSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timKiemSPFocusGained
        //Sự kiện xảy ra khi thành phần txt_timKiemSP UI nhận đc trạng thái focus.
        if (txt_timKiemSP.getText().equals("Tìm kiếm sản phẩm theo mã sản phẩm , tên ....")) {
            txt_timKiemSP.setText(null);
            txt_timKiemSP.requestFocus(); //Yêu cầu tập trung Focus vào 1 component nào đó.
            //remove placeholder style
            removePlaceholderStyle(txt_timKiemSP);
        }
    }//GEN-LAST:event_txt_timKiemSPFocusGained

    private void txt_timKiemSPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timKiemSPFocusLost
        //Sự kiện xảy ra khi thành phần txt_timKiemSP UI nhận đc trạng thái focusLost.
        if (txt_timKiemSP.getText().length() == 0) {
            //add Placeholder style
            addPlaceholderStyle(txt_timKiemSP);
            txt_timKiemSP.setText("Tìm kiếm sản phẩm theo mã sản phẩm , tên ....");
        }
    }//GEN-LAST:event_txt_timKiemSPFocusLost

    private void txt_timKiemSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKiemSPKeyReleased
        String searchString = txt_timKiemSP.getText();
        dtmDSSP = (DefaultTableModel) this.tbl_dssp.getModel();
        search(searchString, dtmDSSP, this.tbl_dssp);
    }//GEN-LAST:event_txt_timKiemSPKeyReleased

    private void btn_firstSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstSPActionPerformed
        if (this.TrangSP > 1) {
            TrangSP = 1;
            lbl_trangSP.setText(String.valueOf(TrangSP));
            lbl_tongSoTrangSP.setText(TrangSP + "/" + soTrangSP);
            if (rdo_tatCa.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SP(TrangSP));
            } else if (rdo_dangKinhDoanh.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP));
            } else {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP));
            }
        } else { //Trang <= 1
            MsgBox.alter(this, "Đã ở trang đầu tiên");
        }
    }//GEN-LAST:event_btn_firstSPActionPerformed

    private void btn_prevSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevSPActionPerformed
        //Thiết lập lại trang đang ở là :  trang và trang/tổng số trang.
        //Thực hiện truy vấn lại 5 đối tượng dựa theo số trang
        if (this.TrangSP > 1) { //Trang là 4 thì chuyển xuống thành trang 3
            TrangSP--;
            lbl_trangSP.setText(String.valueOf(TrangSP));
            lbl_tongSoTrangSP.setText(TrangSP + "/" + soTrangSP);
            if (rdo_tatCa.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SP(TrangSP));
            } else if (rdo_dangKinhDoanh.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP));
            } else {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP));
            }
        } else { //TH trang là 1 hoặc nhỏ hơn 1 thì về trang lớn nhất của nó
            TrangSP = soTrangSP; //Thì nếu số trang là 5 thì trang là 5.
            lbl_trangSP.setText(String.valueOf(TrangSP));
            lbl_tongSoTrangSP.setText(TrangSP + "/" + soTrangSP);
            if (rdo_tatCa.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SP(TrangSP));
            } else if (rdo_dangKinhDoanh.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP));
            } else {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP));
            }
        }
    }//GEN-LAST:event_btn_prevSPActionPerformed

    private void btn_nextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextSPActionPerformed
        if (this.TrangSP < this.soTrangSP) { //Trang 3 nhỏ hơn tổng 5 số trang --> trang lên 4
            TrangSP++;
            lbl_trangSP.setText(String.valueOf(TrangSP));
            lbl_tongSoTrangSP.setText(TrangSP + "/" + soTrangSP);
            if (rdo_tatCa.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SP(TrangSP));
            } else if (rdo_dangKinhDoanh.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP));
            } else {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP));
            }
        } else { //TH trang = số trang
            TrangSP = 1; //Thì nếu số trang là 5 thì sẽ về trang ban đầu là 1.
            lbl_trangSP.setText(String.valueOf(TrangSP));
            lbl_tongSoTrangSP.setText(TrangSP + "/" + soTrangSP);
            if (rdo_tatCa.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SP(TrangSP));
            } else if (rdo_dangKinhDoanh.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP));
            } else {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP));
            }
        }
    }//GEN-LAST:event_btn_nextSPActionPerformed

    private void btn_lastSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastSPActionPerformed
        if (this.TrangSP < this.soTrangSP) { //
            TrangSP = soTrangSP;
            lbl_trangSP.setText(String.valueOf(TrangSP));
            lbl_tongSoTrangSP.setText(TrangSP + "/" + soTrangSP);
            if (rdo_tatCa.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SP(TrangSP));
            } else if (rdo_dangKinhDoanh.isSelected()) {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Đang Kinh Doanh", TrangSP));
            } else {
                Model_fill_SP_To_Table(prd.getTop5SPTheoTrangThai("Dừng Kinh Doanh", TrangSP));
            }
        } else { //TH trang = số trang
            MsgBox.alter(this, "Đã ở trang cuối cùng");
        }
    }//GEN-LAST:event_btn_lastSPActionPerformed

    private void cbb_tenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_tenSPActionPerformed
        //Dựa vào đây phân lại tổng số trang và đặt lại số trang là 1.
        //Thực hiện Truy vấn danh sách SPCT theo : Tên của Sản Phẩm và dựa vào số trang của nó. Ở đây mặc định là 1.
        if (dcbmdTenSP.getSize() > 0) { //Để tránh lỗi Cbb null
            String tenGiay = dcbmdTenSP.getSelectedItem().toString();
            CountSBG_SPCT = prdd.getCountDB_SPCT_ByNameSP(tenGiay);
            soTrang = getSoTrangByCountSoBanGhi(CountSBG_SPCT);
            Trang = 1;
            //--------------Thiết lập các thông tin trang/số trang của Sản phẩm
            lbl_trang.setText("1");//Mặc định trang lúc đầu là trang 1.
            lbl_tongSoTrang.setText("1/" + soTrang);
            //-----------Fill lên bảng 5 đối tượng dựa vào trang. ( Tham số : Trang đang được chọn thì ở đây là mặc định là trang 1 )
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
            //---TH chọn rdo_hienThiTatCa.. mà di chuyển cái combobox này thì thực hiện để phân trang hoạt động
            rdo_HienThi_ALL_SPCT.setSelected(false);
            thietLapHoatDongCho_BtnPhanTrang(true);
        }
    }//GEN-LAST:event_cbb_tenSPActionPerformed

    private void btn_congTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_congTenSPActionPerformed
        handleQuickInsert_TenSP("Nhập tên sản phẩm thêm nhanh");
    }//GEN-LAST:event_btn_congTenSPActionPerformed

    private void btn_congThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_congThuongHieuActionPerformed
        //Chú ý: Ko đc thay đổi chuỗi String ko thì sẽ lỗi
        handleQuickInsert("Nhập tên thương hiệu thêm nhanh");
    }//GEN-LAST:event_btn_congThuongHieuActionPerformed

    private void btn_congKichThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_congKichThuocActionPerformed
        //Chú ý: Ko đc thay đổi chuỗi String ko thì sẽ lỗi
        handleQuickInsert("Nhập tên kích thước thêm nhanh");
    }//GEN-LAST:event_btn_congKichThuocActionPerformed

    private void btn_congMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_congMauSacActionPerformed
        //Chú ý: Ko đc thay đổi chuỗi String ko thì sẽ lỗi
        handleQuickInsert("Nhập tên màu sắc thêm nhanh");
    }//GEN-LAST:event_btn_congMauSacActionPerformed

    private void cbb_congChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_congChatLieuActionPerformed
        //Chú ý: Ko đc thay đổi chuỗi String ko thì sẽ lỗi
        handleQuickInsert("Nhập tên chất liệu thêm nhanh");
    }//GEN-LAST:event_cbb_congChatLieuActionPerformed

    private void btn_congDeGiayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_congDeGiayActionPerformed
        //Chú ý: Ko đc thay đổi chuỗi String ko thì sẽ lỗi
        handleQuickInsert("Nhập tên đế giày thêm nhanh");
    }//GEN-LAST:event_btn_congDeGiayActionPerformed

    private void btn_congDayGiayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_congDayGiayActionPerformed
        //Chú ý: Ko đc thay đổi chuỗi String ko thì sẽ lỗi
        handleQuickInsert("Nhập tên dây giày thêm nhanh");
    }//GEN-LAST:event_btn_congDayGiayActionPerformed

    private void btn_themSPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themSPCTActionPerformed
        String soLuongTonSPCT = txt_soLuong.getText().trim();//Nó cần chek
        String giaBanSPCT = txt_giaBan.getText().trim();//Nó cần chek
        if (dcbThuongHieu != null && cbb_kichThuoc != null && cbb_mauSac != null && cbb_chatLieu != null && cbb_deGiay != null && cbb_dayGiay != null) {//check các combobox ko null
            int checkKhongTrungALL = checkKhongTrungTatCaThuocTinh_KhiInsert_SPCT(dcbThuongHieu.getSelectedItem().toString().trim(), cbb_kichThuoc.getSelectedItem().toString().trim(), cbb_mauSac.getSelectedItem().toString().trim(), cbb_chatLieu.getSelectedItem().toString().trim(), cbb_deGiay.getSelectedItem().toString().trim(), cbb_dayGiay.getSelectedItem().toString().trim());
            if (checkKhongNull_SPCT(soLuongTonSPCT, giaBanSPCT) && checkANumber_SPCT(soLuongTonSPCT, giaBanSPCT) && checkSoHopLe(soLuongTonSPCT, giaBanSPCT)) {
                if (checkKhongTrungALL == -1) {//=-1 là ko trùng tất cả thuộc tính.
                    IspctInsert spctInsert = getSPCT_IDTT();
                    if (prdd.insert(spctInsert) == 1) {//Có 1 bản ghi bị ảnh hưởng
                        soTrang = getSoTrangByCountSoBanGhi(prdd.getCountDB_SPCT_ByNameSP(cbb_tenSP.getSelectedItem().toString()));//Đếm lại số trang dựa vào tên giày
                        Trang = soTrang;
                        lbl_trang.setText(Trang + "");
                        lbl_tongSoTrang.setText(Trang + "/" + soTrang);
                        Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                        int rowCuoi = this.dtmDSSPCT.getRowCount() - 1;
                        setCustomRenderer(this.tbl_SPCT4, rowCuoi);
                        MsgBox.alter(this, "thêm 1 sp mới thành công");
                        if (rdo_tatCa.isSelected()) {//Sau khi update bên SPCT thì cx fill lại bảng bên SP để đồng bộ
                            fill_SP_To_Table();
                        } else if (rdo_dangKinhDoanh.isSelected()) {
                            List<TenGiay> listTG = prd.getTop5SP(TrangSP); //thực hiện truy vấn sản phẩm theo trạng thái
                            Model_fill_SP_To_Table(listTG);
                        } else {
                            List<TenGiay> listTG = prd.getTop5SP(TrangSP);
                            Model_fill_SP_To_Table(listTG);
                        }
                    } else {
                        MsgBox.alter(this, "thêm sp mới thất bại");
                    }
                } else if (checkKhongTrungALL != -1) {//nếu khi update 1 SPCT mà trùng tất cả thuộc tính
                    MsgBox.alter(this, "trùng tất cả thuộc tính với sản phẩm có id là SPCT-" + checkKhongTrungALL);
                }
            }
        } else {
            MsgBox.alter(this, "1 thuộc tính đang hết rồi! Ko thể thêm");
        }
    }//GEN-LAST:event_btn_themSPCTActionPerformed

    private void btn_CapNhatSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatSPActionPerformed
        String soLuongTonSPCT = txt_soLuong.getText().trim();//Nó cần chek
        String giaBanSPCT = txt_giaBan.getText().trim();//Nó cần chek
        int rowSelected = this.tbl_SPCT.getSelectedRow();
        int checkKhongTrungALL = checkKhongTrungTatCaThuocTinh_KhiInsert_SPCT(cbb_thuongHieu.getSelectedItem().toString().trim(), cbb_kichThuoc.getSelectedItem().toString().trim(), cbb_mauSac.getSelectedItem().toString().trim(), cbb_chatLieu.getSelectedItem().toString().trim(), cbb_deGiay.getSelectedItem().toString().trim(), cbb_dayGiay.getSelectedItem().toString().trim());
        if (rowSelected != -1 && checkKhongNull_SPCT(soLuongTonSPCT, giaBanSPCT) && checkANumber_SPCT(soLuongTonSPCT, giaBanSPCT) && checkSoHopLe(soLuongTonSPCT, giaBanSPCT)) {
            IspctInsert spctUpdate = getSPCT_IDTT();//Thực hiện lấy đối tượng update.
            String mess = null;
            if (checkKhongTrungALL == -1) {//TH có thay đổi thuộc tính && ko bị trùng attri vs spct nào khác <=> giá hay sl cập nhật ko ko quan trọng. Vì đã có sự thay đổi.
                if (prdd.update(spctUpdate) == 1) {//Có 1 bản ghi bị ảnh hưởng
                    Trang = Integer.valueOf(lbl_trang.getText());
                    Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                    setCustomRenderer(tbl_SPCT4, rowSelected);
                    mess = "Cập nhật thuộc tính sản phẩm thành công";
                }
            } else if (checkKhongTrungALL != -1) {// TH trùng attri vs spct.
                //TH1: trùng vs spct update <=> y.c khác giá bán/sl để cập nhật. Xét xem id trùng trả về có giống id chọn ko.
                if (spctUpdate.getId_SPCT() == checkKhongTrungALL && (checkKhongTrungSoLuong(rowSelected, soLuongTonSPCT) || checkKhongTrungGiaBan(rowSelected, giaBanSPCT))) {
                    if (prdd.update(spctUpdate) == 1) {//Có 1 bản ghi bị ảnh hưởng
                        Trang = Integer.valueOf(lbl_trang.getText());
                        Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                        setCustomRenderer(tbl_SPCT4, rowSelected);
                        mess = "Cập nhật giá bán/sl thành công";
                    }
                } else if (spctUpdate.getId_SPCT() != checkKhongTrungALL) {
                    mess = "update thất bại do thuộc tính cập nhật cho sản phẩm trùng với sản phẩm SPCT-" + checkKhongTrungALL;
                } else {
                    mess = "Vui lòng cập nhật 1 trường giá trị để thực hiện update";
                }
            } else if (rowSelected == -1) {
                MsgBox.alter(this, "vui lòng chọn dòng để thực hiện update");
            }
            MsgBox.alter(this, mess);
        }
    }//GEN-LAST:event_btn_CapNhatSPActionPerformed

    private void btn_lamMoiSPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiSPCTActionPerformed
        clearSPCT();
    }//GEN-LAST:event_btn_lamMoiSPCTActionPerformed

    private void btn_xuatFileExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatFileExcelActionPerformed
        if (tbl_SPCT4.getRowCount() > 0) {
            try {
                XSSFWorkbook wordkbook = new XSSFWorkbook(); //Tạo 1 đối tượng đại diện cho 1 File Excel ( .xlsx )
                XSSFSheet sheet = wordkbook.createSheet("DanhSachSPCT"); //Tạo 1 trang mới trong workbook với tên là "DanhSachSPCT"
                XSSFRow row_sheet = null;//Khai báo 1 hàng

                row_sheet = sheet.createRow(3); //Tạo 1 hàng mới ở dòng thứ 4 ( vị trí 3, vì dòng đầu tiên là 0 )
                XSSFCell cell = row_sheet.createCell(0, CellType.STRING); //Tạo 1 ô ( cell ) trong hàng với kiểu dữ liệu là STRING ở cột đầu tiên ( cột có index là 0 )
                cell.setCellValue("STT");//Gán giá trị "CTT" cho ô vừa tạo

                cell = row_sheet.createCell(1, CellType.STRING);
                cell.setCellValue("Tên Sản Phẩm");

                cell = row_sheet.createCell(2, CellType.STRING);
                cell.setCellValue("Mã SPCT");

                cell = row_sheet.createCell(3, CellType.STRING);
                cell.setCellValue("Thương Hiệu");
                cell = row_sheet.createCell(4, CellType.STRING);
                cell.setCellValue("Kích Cỡ");
                cell = row_sheet.createCell(5, CellType.STRING);
                cell.setCellValue("Màu Sắc");
                cell = row_sheet.createCell(6, CellType.STRING);
                cell.setCellValue("Chất Liệu");
                cell = row_sheet.createCell(7, CellType.STRING);
                cell.setCellValue("Đế Giày");
                cell = row_sheet.createCell(8, CellType.STRING);
                cell.setCellValue("Dây Giày");
                cell = row_sheet.createCell(9, CellType.STRING);
                cell.setCellValue("Số Lượng Tồn");
                cell = row_sheet.createCell(10, CellType.STRING);
                cell.setCellValue("Giá Bán");

                for (int i = 0; i < this.tbl_SPCT4.getRowCount(); i++) {
                    //                Modelbook book =arr.get(i);
                    row_sheet = sheet.createRow(5 + i); //tạo 1 hàng mới bắt đầu bằng dòng thứ 6 và tăng dần.

                    cell = row_sheet.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 0)));

                    cell = row_sheet.createCell(1, CellType.STRING);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 1)));

                    cell = row_sheet.createCell(2, CellType.STRING);
                    cell.setCellValue("SPCT-" + this.tbl_SPCT4.getValueAt(i, 2));

                    cell = row_sheet.createCell(3, CellType.STRING);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 3)));

                    cell = row_sheet.createCell(4, CellType.STRING);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 4)));

                    cell = row_sheet.createCell(5, CellType.STRING);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 5)));

                    cell = row_sheet.createCell(6, CellType.STRING);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 6)));

                    cell = row_sheet.createCell(7, CellType.STRING);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 7)));

                    cell = row_sheet.createCell(8, CellType.STRING);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 8)));

                    cell = row_sheet.createCell(9, CellType.NUMERIC);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 9)));

                    cell = row_sheet.createCell(10, CellType.NUMERIC);
                    cell.setCellValue(String.valueOf(this.tbl_SPCT4.getValueAt(i, 10)));
                }
                File f = new File("E:\\Du_an1_ql\\DanhSachSPCT.xlsx");
                try {
                    FileOutputStream fis = new FileOutputStream(f);
                    wordkbook.write(fis);
                    fis.close();
                    JOptionPane.showMessageDialog(this, "Xuat File Thanh Cong");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Loi mo file");
            }
        } else {
            MsgBox.alter(this, "trên bảng ko có dữ liệu --> Xuất File thất bại");
        }
    }//GEN-LAST:event_btn_xuatFileExcelActionPerformed

    private void btn_xoaSPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaSPCTActionPerformed
        //xóa bản chất là cập nhật lại xóa mềm của nó là : 1. Đến khi bán hàng thì truy vấn ra SPCT vs trạng thái SP là : Đang Kinh Doanh và xóa mềm = 0
        int rowSelected = this.tbl_SPCT4.getSelectedRow();
        if (rowSelected != -1) {
            boolean confirm = MsgBox.confirm(this, "Bạn muốn xóa sản phẩm" + this.tbl_SPCT4.getValueAt(rowSelected, 2));
            if (confirm) {
                Ispct spct = new Ispct();
                spct.setId(Integer.valueOf(this.tbl_SPCT4.getValueAt(rowSelected, 2).toString().substring(5)));
                spct.setDeleted(1);//Cập nhật trạng thái đã xóa.
                String message = (prdd.updateXoaMem(spct) != -1) ? "Xóa sản phẩm thành công" : "Xóa sản phẩm thất bại";
                MsgBox.alter(this, message);

                int soBanGhi = prdd.getCountDB_SPCT_ByNameSP(cbb_tenSP.getSelectedItem().toString());
                if (soBanGhi == 0) { //Nếu khi xóa đi ko đếm đc đối tượng nào --> Xóa trag thiết lập lại phân trang.
                    clearSPCT();
                    dtmDSSPCT.setRowCount(Trang = soTrang = 0);
                    lbl_trang.setText("0");
                    lbl_tongSoTrang.setText("0/" + soTrang);
                } else {//TH xóa && bản ghi > 0
                    if (Trang == soTrang) {// xóa ở trang cuối.
                        soTrang = getSoTrangByCountSoBanGhi(soBanGhi);//đếm lại số trang.
                        if (soBanGhi % 5 == 0) {
                            clearSPCT();
                            Trang--;
                            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                            lbl_trang.setText(Trang + "");
                            lbl_tongSoTrang.setText(soTrang + "");
                        } else if (soBanGhi % 5 != 0) {
                            clearSPCT();
                            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                        }
                    } else if (Trang < soTrang) {//xóa ko phải ở trang cuối.
                        soTrang = getSoTrangByCountSoBanGhi(soBanGhi);//đếm lại số trang
                        if (soBanGhi % 5 == 0) {
                            clearSPCT();
                            soTrang = getSoTrangByCountSoBanGhi(soBanGhi);//đếm lại số trang.
                            lbl_tongSoTrangSP.setText(soTrang + "");
                            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                        } else if (soBanGhi % 5 != 0) {
                            clearSPCT();
                            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                        }
                    }
                    //TH : Khi xóa 1 obj mà đang ở trang cuối ( trang = soTrang ) :
                    //case1: chia hết : --> Lùi lại 1 trang ( VD: trang 3 : 11--10 ?? trang2: 6--5 , trang1: 1--0  ) -- cập nhật lại phân trang
                    //case2: Ko chia chết : --> Ko lùi lại  ( VD: trang 3 : 15--14 , trang1 : 5--4 ) -- ko cập nhật.
                    //------------
                    //TH : Khi xóa 1 obj mà đag ở trang giữa (  trang < soTrang )
                    //case1: chia hết : ko lùi lại ( VD : trang 2 : 11--10 21--20 / trang1: 6--5 ). ( cập nhật lại phân trang )
                    //case2: ko chia hết : ko lùi lại  ( VD : trang 2 : 14--13 , 25--24 , trang1: 8--7 ). ( ko cập nhật lại phân trang )
                }
            }
        } else {
            MsgBox.alter(this, "Vui lòng chọn sản phẩm để xóa ");
        }
    }//GEN-LAST:event_btn_xoaSPCTActionPerformed

    private void tbl_SPCT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SPCT4MouseClicked
        int rowSelected = this.tbl_SPCT4.getSelectedRow();
        if (dtmDSSPCT.getRowCount() > 0 && evt.getClickCount() == 2) { //rowCount thực tế là đếm số đối tượng ở mỗi dòng trên bảng.
            int ID_SPCT = Integer.valueOf(this.tbl_SPCT4.getValueAt(rowSelected, 2).toString().substring(5));
            Ispct spct = prdd.selectById_To_ThemNhanh(ID_SPCT);//thực hiện truy vấn 1 spct dựa theo ID_SPCT chọn trên bảng
            JDiaLogUpdateSPCT dialog = new JDiaLogUpdateSPCT(spct); //Tạo đối tượng
            dialog.addWindowListener(new WindowAdapter() {//Đăng ký các sự kiện thực hiện khi đóng JDiaLOg.
                @Override
                public void windowClosed(WindowEvent e) {
                    // Xử lý khi cửa sổ JDiaLog đóng ( disposed )
                    //Dựa vào tên sp update thì thực hiện fill lại sản phẩm chi tiết ở số trang đó;
                    if (!rdo_HienThi_ALL_SPCT.isSelected()) {
                        Trang = Integer.valueOf(lbl_trang.getText());
                        Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
                        setCustomRenderer(tbl_SPCT4, rowSelected);
                    } else {
                        fill_ALL_SPCT_To_Table();
                        setCustomRenderer(tbl_SPCT4, rowSelected);
                    }
                }
            });
            dialog.setVisible(true); //khởi tạo giao diện r nó sẽ chạy xuống dưới nếu có
        } else if (evt.getClickCount() == 1) {//Khi oneClick vào 1 đối tượng trên bảng thì đẩy thông tin đối tượng đó lên các thành phần
            Ispct spct = prdd.selectById_To_ThemNhanh(Integer.valueOf(this.tbl_SPCT4.getValueAt(rowSelected, 2).toString().substring(5)));
            txt_maSPCT.setText(String.valueOf(spct.getId()));
            txt_soLuong.setText(String.valueOf(spct.getSoLuong()));
            txt_giaBan.setText(String.valueOf(formatNumber_BoDauCham(spct.getGiaBan())));
            ta_moTa.setText(spct.getMoTa());
            cbb_thuongHieu.setSelectedItem(spct.getNamethuongHieu());
            cbb_kichThuoc.setSelectedItem(Integer.valueOf(spct.getNamekichCo().trim()));//Kiểu cbb_kichThuoc là java.lang.Integer nên cẩn chuyển lại cho phù hợp.Thì giờ cần phải valida kích thước là number ko thì Excep ko ép đc kiểu thành Integer.
            cbb_mauSac.setSelectedItem(spct.getNamemauSac());
            cbb_chatLieu.setSelectedItem(spct.getNamechatLieu());
            cbb_deGiay.setSelectedItem(spct.getNamedeGiay());
            cbb_dayGiay.setSelectedItem(spct.getNamedayGiay());

            //            dcbThuongHieu.setSelectedItem(spct.getNamethuongHieu());dcbKichThuoc.setSelectedItem(spct.getNamekichCo());dcbMauSac.setSelectedItem(spct.getNamemauSac());dcbChatLieu.setSelectedItem(spct.getNamechatLieu());dcbDeGiay.setSelectedItem(spct.getNamedeGiay());dcbDayGiay.setSelectedItem(spct.getNamedayGiay());
            this.tbl_SPCT4.repaint(); //Thực hiện để xóa HighLight của bảng
            setCustomRenderer(this.tbl_SPCT4, -1); //Thực hiện thiết lập lại s.kiện HighLight.
        }
    }//GEN-LAST:event_tbl_SPCT4MouseClicked

    private void rdo_HienThi_ALL_SPCT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_HienThi_ALL_SPCT2ActionPerformed
        if (rdo_HienThi_ALL_SPCT.isSelected()) {
            fill_ALL_SPCT_To_Table();
            thietLapHoatDongCho_BtnPhanTrang(false);
        } else {//nếu bỏ chọn thì thực hiện fill lại bảng các đối tượng theo trang đanh chọn.
            thietLapHoatDongCho_BtnPhanTrang(true);
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        }
    }//GEN-LAST:event_rdo_HienThi_ALL_SPCT2ActionPerformed

    private void txt_timKiemSPCT2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timKiemSPCT2FocusGained
        //Sự kiện xảy ra khi thành phần txt_timKiemSP UI nhận đc trạng thái focus.
        if (txt_timKiemSPCT.getText().equals("Tìm kiếm SPCT theo Mã SPCT , tên , thuộc tính ..... ")) {
            txt_timKiemSPCT.setText(null);
            txt_timKiemSPCT.requestFocus();
            //remove placeholder style
            removePlaceholderStyle(txt_timKiemSPCT);
        }
    }//GEN-LAST:event_txt_timKiemSPCT2FocusGained

    private void txt_timKiemSPCT2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timKiemSPCT2FocusLost
        //FocusLost : evt xảy ra khi compenent UI mất đi focus vào chính nó <=>  Focus ko vào thành phần khác ko phải nó
        if (txt_timKiemSPCT.getText().length() == 0) {
            //add Placeholder style
            addPlaceholderStyle(txt_timKiemSPCT);
            txt_timKiemSPCT.setText("Tìm kiếm SPCT theo Mã SPCT , tên , thuộc tính ..... ");
        }
    }//GEN-LAST:event_txt_timKiemSPCT2FocusLost

    private void txt_timKiemSPCT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKiemSPCT2KeyReleased
        //KeyReleased : evt xảy ra khi người dùng nhấn 1 phím và nhả nó ra.
        String searchString = txt_timKiemSPCT.getText();
        dtmDSSPCT = (DefaultTableModel) this.tbl_SPCT4.getModel();
        search(searchString, dtmDSSPCT, this.tbl_SPCT4);
    }//GEN-LAST:event_txt_timKiemSPCT2KeyReleased

    private void btn_first2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_first2ActionPerformed
        if (this.Trang > 1) {
            Trang = 1;
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        } else { //Trang <= 1
            MsgBox.alter(this, "Đã ở trang đầu tiên");
        }
    }//GEN-LAST:event_btn_first2ActionPerformed

    private void btn_prev2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prev2ActionPerformed
        //Thiết lập lại trang đang ở là :  trang và trang/tổng số trang.
        //Thực hiện truy vấn lại 5 đối tượng dựa theo số trang
        if (soTrang > 0) {
            if (this.Trang > 1) { //Trang là 4 thì chuyển xuống thành trang 3
                Trang--;
                lbl_trang.setText(String.valueOf(Trang));
                lbl_tongSoTrang.setText(Trang + "/" + soTrang);
                Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
            } else { //TH trang là 1 hoặc nhỏ hơn 1 thì về trang lớn nhất của nó
                Trang = soTrang; //Thì nếu số trang là 5 thì trang là 5.
                lbl_trang.setText(String.valueOf(Trang));
                lbl_tongSoTrang.setText(Trang + "/" + soTrang);
                Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
            }
        } else {
            MsgBox.alter(this, "Ko còn sản phẩm ko thể chuyển trang");
        }
    }//GEN-LAST:event_btn_prev2ActionPerformed

    private void btn_next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next2ActionPerformed
        if (this.Trang < this.soTrang) { //Trang 3 nhỏ hơn tổng 5 số trang --> trang lên 4
            Trang++;
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        } else { //TH trang = số trang
            Trang = 1; //Thì nếu số trang là 5 thì sẽ về trang ban đầu là 1.
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        }
    }//GEN-LAST:event_btn_next2ActionPerformed

    private void btn_last2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_last2ActionPerformed
        if (this.Trang < this.soTrang) { //
            Trang = soTrang;
            lbl_trang.setText(String.valueOf(Trang));
            lbl_tongSoTrang.setText(Trang + "/" + soTrang);
            Model_fill_SPCT_To_Table(GetList_SPCT_ByName_Width5Object_To_Table(Trang));
        } else { //TH trang = số trang
            MsgBox.alter(this, "Đã ở trang cuối cùng");
        }
    }//GEN-LAST:event_btn_last2ActionPerformed

    private void rdo_kichThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_kichThuocActionPerformed
        fill_KichCo_ToTable();
    }//GEN-LAST:event_rdo_kichThuocActionPerformed

    private void rdo_chatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_chatLieuActionPerformed
        fill_ChatLieu_ToTable();
    }//GEN-LAST:event_rdo_chatLieuActionPerformed

    private void rdo_mauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_mauSacActionPerformed
        fill_MauSac_ToTable();
    }//GEN-LAST:event_rdo_mauSacActionPerformed

    private void rdo_thuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_thuongHieuActionPerformed
        fill_ThuongHieu_ToTable();
    }//GEN-LAST:event_rdo_thuongHieuActionPerformed

    private void rdo_deGiayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_deGiayActionPerformed
        fill_DeGiay_ToTable();
    }//GEN-LAST:event_rdo_deGiayActionPerformed

    private void rdo_dayGiayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_dayGiayActionPerformed
        fill_DayGiay_ToTable();
    }//GEN-LAST:event_rdo_dayGiayActionPerformed

    private void btn_themTTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themTTSPActionPerformed
        if (MsgBox.confirm(this, "Thêm thuộc tính ? ")) {
            if (checkNullThuocTinh()) {//Đã có tb y.cầu nhập r
                String NameThuocTinh = txt_tenThuocTinh.getText();
                if (rdo_kichThuoc.isSelected() && checkNotNumber(NameThuocTinh) && checkKhongTonTaiThuocTinh() && checkHopLyKichThuoc35_45(NameThuocTinh)) {
                    insertKichThuoc(NameThuocTinh);
                    fill_KichCo_ToTable(); //Đẩy lại danh sách kích thước lên bảng
                    fill_KichThuoc_To_Cbb(); //Đẩy lại danh sách kích thước lên Cbb
                } else if (rdo_chatLieu.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(NameThuocTinh)) {
                    insertChatLieu(NameThuocTinh);
                    fill_ChatLieu_ToTable();
                    fill_ChatLieu_To_Cbb();
                } else if (rdo_mauSac.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(NameThuocTinh)) {
                    insertMauSac(NameThuocTinh);
                    fill_MauSac_ToTable();
                    fill_MauSac_To_Cbb();
                } else if (rdo_thuongHieu.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(NameThuocTinh)) {
                    insertThuongHieu(NameThuocTinh);
                    fill_ThuongHieu_ToTable();
                    fill_ThuongHieu_To_Cbb();
                } else if (rdo_deGiay.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(NameThuocTinh)) {
                    insertDeGiay(NameThuocTinh);
                    fill_DeGiay_ToTable();
                    fill_DeGiay_To_Cbb();
                } else if (rdo_dayGiay.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(NameThuocTinh)) {
                    insertDayGiay(NameThuocTinh);
                    fill_DayGiay_ToTable();
                    fill_DayGiay_To_Cbb();
                } else {
                    MsgBox.alter(this, "Hủy thao tác thêm");
                }
            }
            setCustomRenderer(this.tbl_TTSP, 0); //HighLigh vào đối tượng vừa đc thêm vào.
        }
    }//GEN-LAST:event_btn_themTTSPActionPerformed

    private void btn_suaTTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaTTSPActionPerformed
        int rowSelected = this.tbl_TTSP.getSelectedRow(); //Chọn đối tượng cần sửa. Ko đc ko chọn
        String tenThuocTinh = txt_tenThuocTinh.getText().trim();
        if (MsgBox.confirm(this, "Sửa tên thuộc tính")) {
            if (rowSelected != -1 && checkNullThuocTinh()) {//Check trống
                if (rdo_kichThuoc.isSelected() && checkNotNumber(tenThuocTinh) && checkKhongTonTaiThuocTinh() && checkHopLyKichThuoc35_45(tenThuocTinh)) {//Số update phải chưa tồn tại
                    //Nếu là update kích thước thì check trống && check là số && check phải tồn tại
                    MsgBox.alter(this, "Update kích thước " + this.tbl_TTSP.getValueAt(rowSelected, 1) + " thành " + txt_tenThuocTinh.getText().trim() + "Thành công");
                    updateKichThuoc(rowSelected);
                    fill_KichCo_ToTable();
                    fill_KichThuoc_To_Cbb();
                } else if (rdo_chatLieu.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(tenThuocTinh)) {
                    MsgBox.alter(this, "Update Chất Liệu " + this.tbl_TTSP.getValueAt(rowSelected, 1) + " thành " + txt_tenThuocTinh.getText().trim() + "Thành công");
                    updateChatLieu(rowSelected);
                    fill_ChatLieu_ToTable();
                    fill_ChatLieu_To_Cbb();
                } else if (rdo_mauSac.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(tenThuocTinh)) {
                    MsgBox.alter(this, "Update Màu Sắc " + this.tbl_TTSP.getValueAt(rowSelected, 1) + " thành " + txt_tenThuocTinh.getText().trim() + "Thành công");
                    updateMauSac(rowSelected);
                    fill_MauSac_ToTable();
                    fill_MauSac_To_Cbb();
                } else if (rdo_thuongHieu.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(tenThuocTinh)) {
                    MsgBox.alter(this, "Update Thương Hiệu " + this.tbl_TTSP.getValueAt(rowSelected, 1) + " thành " + txt_tenThuocTinh.getText().trim() + "Thành công");
                    updateThuongHieu(rowSelected);
                    fill_ThuongHieu_ToTable();
                    fill_ThuongHieu_To_Cbb();
                } else if (rdo_deGiay.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(tenThuocTinh)) {
                    MsgBox.alter(this, "Update Đế Giày " + this.tbl_TTSP.getValueAt(rowSelected, 1) + " thành " + txt_tenThuocTinh.getText().trim() + "Thành công");
                    updateDeGiay(rowSelected);
                    fill_DeGiay_ToTable();
                    fill_DeGiay_To_Cbb();
                } else if (rdo_dayGiay.isSelected() && checkKhongTonTaiThuocTinh() && checkTenThuocTinh_chiLaChuVaKhoangTrang(tenThuocTinh)) {
                    MsgBox.alter(this, "Update Dây Giày " + this.tbl_TTSP.getValueAt(rowSelected, 1) + " thành " + txt_tenThuocTinh.getText().trim() + "Thành công");
                    updateDayGiay(rowSelected);
                    fill_DayGiay_ToTable();
                    fill_DayGiay_To_Cbb();
                } else {
                    MsgBox.alter(this, "Hủy thao tác Update");
                }
            } else {
                MsgBox.alter(this, "Lỗi Update không thành công do Null hoặc ko có dòng nào đc chọn");
            }
        } else {
            MsgBox.alter(this, "Hủy thao tác Update");
        }
    }//GEN-LAST:event_btn_suaTTSPActionPerformed

    private void btn_lamMoiTTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiTTSPActionPerformed
        clearnThuocTinh();
    }//GEN-LAST:event_btn_lamMoiTTSPActionPerformed

    private void btn_xoaTTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTTSPActionPerformed
        int rowSelected = this.tbl_TTSP.getSelectedRow();
        if (rowSelected != -1 && tbl_TTSP.getRowCount() > 1) {//chek dòng nào đc chọn ko.
            int id = Integer.valueOf(this.tbl_TTSP.getValueAt(rowSelected, 0).toString());
            if (rdo_kichThuoc.isSelected() && MsgBox.confirm(this, "Bạn muỗn xóa kích thước ?")) {
                String message = (kcd.delete(id) != 0) ? "xóa kích cỡ " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thành công" : "xóa kích cỡ " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thất bại";
                MsgBox.alter(this, message);
                fill_KichCo_ToTable();
                fill_KichThuoc_To_Cbb();
                clearTTSP();
            } else if (rdo_chatLieu.isSelected() && MsgBox.confirm(this, "Bạn muỗn xóa chất liệu ?")) {
                String message = (cld.delete(id) != 0) ? "xóa chất liệu " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thành công" : "xóa chất liệu " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thất bại";
                MsgBox.alter(this, message);
                fill_ChatLieu_ToTable();
                fill_ChatLieu_To_Cbb();
                clearTTSP();
            } else if (rdo_mauSac.isSelected() && MsgBox.confirm(this, "Bạn muỗn xóa màu sắc ?")) {
                String message = (msd.delete(id) != 0) ? "xóa màu sắc " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thành công" : "xóa màu sắc " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thất bại";
                MsgBox.alter(this, message);
                fill_MauSac_ToTable();
                fill_MauSac_To_Cbb();
                clearTTSP();
            } else if (rdo_thuongHieu.isSelected() && MsgBox.confirm(this, "Bạn muỗn xóa thương hiệu ?")) {
                String message = (thd.delete(id) != 0) ? "xóa thương hiệu " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thành công" : "xóa thương hiệu " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thất bại";
                MsgBox.alter(this, message);
                fill_ThuongHieu_ToTable();
                fill_ThuongHieu_To_Cbb();
                clearTTSP();
            } else if (rdo_deGiay.isSelected() && MsgBox.confirm(this, "Bạn muỗn xóa đế giày ?")) {
                String message = (dgd.delete(id) != 0) ? "xóa đế giày " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thành công" : "xóa đế giày " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thất bại";
                MsgBox.alter(this, message);
                fill_DeGiay_ToTable();
                fill_DeGiay_To_Cbb();
                clearTTSP();
            } else if (rdo_dayGiay.isSelected() && MsgBox.confirm(this, "Bạn muỗn xóa dây giày ?")) {
                String message = (dgd2.delete(id) != 0) ? "xóa đế giày " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thành công" : "xóa đế giày " + tbl_TTSP.getValueAt(rowSelected, 1).toString() + " thất bại";
                MsgBox.alter(this, message);
                fill_DayGiay_ToTable();
                fill_DayGiay_To_Cbb();
                clearTTSP();
            } else {
                MsgBox.alter(this, "Hủy thao tác xóa");
            }
        } else if (rowSelected == -1) {
            MsgBox.alter(this, "Vui lòng chọn đối tượng để xóa.");
        } else if (tbl_TTSP.getRowCount() == 1) {
            MsgBox.alter(this, "Ko được xóa thuộc tính cuối cùng");
        }
    }//GEN-LAST:event_btn_xoaTTSPActionPerformed

    private void tbl_TTSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TTSPMouseClicked
        int rowSelected = this.tbl_TTSP.getSelectedRow();
        if (dtmDSTT.getRowCount() > 0 && evt.getClickCount() == 1) {
            txt_maThuocTinh.setText(this.tbl_TTSP.getValueAt(rowSelected, 0).toString());
            txt_tenThuocTinh.setText(this.tbl_TTSP.getValueAt(rowSelected, 1).toString());
            this.tbl_TTSP.repaint(); //Thực hiện để xóa HighLight của bảng
            setCustomRenderer(this.tbl_TTSP, -1); //Thực hiện thiết lập lại s.kiện HighLight.
        }
    }//GEN-LAST:event_tbl_TTSPMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JPSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhatSP;
    private javax.swing.JButton btn_congDayGiay;
    private javax.swing.JButton btn_congDeGiay;
    private javax.swing.JButton btn_congKichThuoc;
    private javax.swing.JButton btn_congMauSac;
    private javax.swing.JButton btn_congTenSP;
    private javax.swing.JButton btn_congThuongHieu;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_first2;
    private javax.swing.JButton btn_firstSP;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_lamMoiSPCT;
    private javax.swing.JButton btn_lamMoiTTSP;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_last2;
    private javax.swing.JButton btn_lastSP;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_next2;
    private javax.swing.JButton btn_nextSP;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_prev2;
    private javax.swing.JButton btn_prevSP;
    private javax.swing.JButton btn_suaTTSP;
    private javax.swing.JButton btn_themSPCT;
    private javax.swing.JButton btn_themTTSP;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update1;
    private javax.swing.JButton btn_xoaSPCT;
    private javax.swing.JButton btn_xoaTTSP;
    private javax.swing.JButton btn_xuatFileExcel;
    private javax.swing.JComboBox<String> cbb_chatLieu;
    private javax.swing.JButton cbb_congChatLieu;
    private javax.swing.JComboBox<String> cbb_dayGiay;
    private javax.swing.JComboBox<String> cbb_deGiay;
    private javax.swing.JComboBox<String> cbb_kichThuoc;
    private javax.swing.JComboBox<String> cbb_mauSac;
    private javax.swing.JComboBox<String> cbb_tenSP;
    private javax.swing.JComboBox<String> cbb_thuongHieu;
    private javax.swing.JComboBox<String> cbb_trangThaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpn_DSSP;
    private javax.swing.JPanel jpn_SPCT;
    private javax.swing.JPanel jpn_TTSP;
    private javax.swing.JPanel jpn_tblSPCT;
    private javax.swing.JPanel jpn_tblSPCT3;
    private javax.swing.JLabel lbl_avatar;
    private javax.swing.JLabel lbl_thongBao_SPCT;
    private javax.swing.JLabel lbl_thongBao_SPCT2;
    private javax.swing.JLabel lbl_tongSoTrang;
    private javax.swing.JLabel lbl_tongSoTrang2;
    private javax.swing.JLabel lbl_tongSoTrangSP;
    private javax.swing.JLabel lbl_trang;
    private javax.swing.JLabel lbl_trang2;
    private javax.swing.JLabel lbl_trangSP;
    private javax.swing.JRadioButton rdo_HienThi_ALL_SPCT;
    private javax.swing.JRadioButton rdo_HienThi_ALL_SPCT2;
    private javax.swing.JRadioButton rdo_chatLieu;
    private javax.swing.JRadioButton rdo_dangKinhDoanh;
    private javax.swing.JRadioButton rdo_dayGiay;
    private javax.swing.JRadioButton rdo_deGiay;
    private javax.swing.JRadioButton rdo_dungKinhDoanh;
    private javax.swing.JRadioButton rdo_kichThuoc;
    private javax.swing.JRadioButton rdo_mauSac;
    private javax.swing.JRadioButton rdo_tatCa;
    private javax.swing.JRadioButton rdo_thuongHieu;
    private javax.swing.JTextArea ta_moTa;
    public javax.swing.JTable tbl_SPCT;
    public javax.swing.JTable tbl_SPCT4;
    private javax.swing.JTable tbl_TTSP;
    private javax.swing.JTable tbl_dssp;
    private javax.swing.JTabbedPane tbp;
    private javax.swing.JPanel tbp_SP;
    private javax.swing.JPanel tbp_SPCT;
    private javax.swing.JPanel tbp_TTSP;
    private javax.swing.JTextField txt_giaBan;
    private javax.swing.JTextField txt_maSP;
    private javax.swing.JTextField txt_maSPCT;
    private javax.swing.JTextField txt_maThuocTinh;
    private javax.swing.JTextField txt_ngayCapNhatSP;
    private javax.swing.JTextField txt_ngayTaoSP;
    private javax.swing.JTextField txt_nguoiSuaSP;
    private javax.swing.JTextField txt_nguoiTaoSP;
    private javax.swing.JTextField txt_soLuong;
    private javax.swing.JTextField txt_tenSP;
    private javax.swing.JTextField txt_tenThuocTinh;
    private javax.swing.JTextField txt_timKiemSP;
    private javax.swing.JTextField txt_timKiemSPCT;
    private javax.swing.JTextField txt_timKiemSPCT2;
    // End of variables declaration//GEN-END:variables
    //Dao các đối tượng
    ProductDAO prd = new ProductDAO();
    ProductDetaisDAO prdd = new ProductDetaisDAO();
    ThuongHieuDao thd = new ThuongHieuDao();
    KichCoDAO kcd = new KichCoDAO();
    MauSacDAO msd = new MauSacDAO();
    ChatLieuDAO cld = new ChatLieuDAO();
    DeGiayDao dgd = new DeGiayDao();
    DayGiayDao dgd2 = new DayGiayDao();

    //Modun các bảng 
    DefaultTableModel dtmDSSP;
    DefaultTableModel dtmDSSPCT;
    DefaultTableModel dtmDSTT;
    //Modun các combobox
    DefaultComboBoxModel dcbmdTenSP;
    DefaultComboBoxModel dcbThuongHieu;
    DefaultComboBoxModel dcbKichThuoc;
    DefaultComboBoxModel dcbMauSac;
    DefaultComboBoxModel dcbChatLieu;
    DefaultComboBoxModel dcbDeGiay;
    DefaultComboBoxModel dcbDayGiay;

    //---------------------Biến dùng để làm phân trang SPCT
    int CountSBG_SPCT;
    int soTrang; //Dựa trên combobox sản phẩm mà mỗi lần thực hiện thay đổi tên SP thì số trạng nó sẽ thay đổi sao cho phù hợp
    int Trang = 1;
    //--------------------Biến phân trang sản phẩm
    int countSBG_SP;
    int soTrangSP;
    int TrangSP = 1;

    private void initSP() {
        fill_SP_To_Table();
        setCustomRenderer(this.tbl_dssp, -1);
    }

    //Thực hiện truy vấn danh sách Tên SP tham số câu truy vấn 
    private void Model_fill_SP_To_Table(List<TenGiay> listTG) {
        dtmDSSP = (DefaultTableModel) this.tbl_dssp.getModel();
        dtmDSSP.setRowCount(0);
        int i = returnSTT_By_TrangSP();
        for (TenGiay tg : listTG) {
            Object[] row = new Object[]{
                i++,
                "SP-00" + tg.getId(),
                tg.getName(),
                prd.select_SL_SPCT_By_IDTenGiay(tg.getId()),
                tg.getStatus().trim() //Trạng thái ban đầu của sản phẩm khi thêm vào sẽ là "Đanh Kinh Doanh"
            };
            dtmDSSP.addRow(row);
        }
    }

    //Lấy tất cả sản phẩm theo trang SP truyền vào với ngày tạo giảm dần.
    private void fill_SP_To_Table() {
        CountSoTrangSP();//Thực hiện đếm số trang sẩn phẩm
        TrangSP = 1;
        lbl_tongSoTrangSP.setText(TrangSP + "/" + soTrangSP);
        lbl_trangSP.setText(TrangSP + "");
        List<TenGiay> listTG = prd.getTop5SP(TrangSP); //Lấy ra 5 bản ghi ở trang 1 fill lên bảng
        Model_fill_SP_To_Table(listTG);          // Đổ danh sách đó lên bảng.
    }

//thực hiện Insert Tên Giày. ( Khi thêm trống Update_by để sau ) Create_at , Update_at default.
    public TenGiay getTenSPInsert(String inputTenSP) {
        TenGiay tg = new TenGiay();
        tg.setName(inputTenSP.trim());
        tg.setStatus(cbb_trangThaiSP.getSelectedItem().toString().trim()); //Lấy trạng thái SP theo CBB
        tg.setCreate_By(GetChucVu.getId()); //người tạo
        tg.setUpdate_At(null); //khi thêm thì ngày sửa bằng null.
        return tg;
    }

    public TenGiay getTenSPUpdate(int ID_SP) { //Dựa vào dòng đang chọn mà lấy ID_TenGiay để thực hiện update
        TenGiay tg = new TenGiay();
        tg.setId(ID_SP); //Thiết Lập Mã SP chọn trên Table.
        tg.setName(txt_tenSP.getText());
        tg.setStatus(cbb_trangThaiSP.getSelectedItem().toString().trim());//lấy trạng thái đang muốn update ở cbb
        tg.setUpdate_By(GetChucVu.getId());
        tg.setUpdate_At(new Date());
        return tg;
    }

    //Check rỗng
    public boolean checkNull(String inputTenSP) {
        boolean itNotNull = !inputTenSP.isEmpty();
        boolean KhongTrungChuAn = !inputTenSP.equals("Nhập tên sản phẩm");//trường nhập ko nhấn gì mà nhấn vào insert luôn thì check xem nó có trùng chữ ẩn ko
        return itNotNull && KhongTrungChuAn;
    }

    //Để xem sp tồn tại chưa. Khi phân trang thì cần check tồn tại so với DB
    public boolean checkKhongTonTaiChoSP(String inputTenSP) {
        List<TenGiay> listSP = prd.selectAll(); //Lấy dánh sách SP
        for (TenGiay tg : listSP) { //đổ từ danh sách ra tên giày xem có trùng ko.
            if (tg.getName().equals(inputTenSP)) {
                return false;
            }
        }
        return true;
    }

    //Khi update nếu trạng thái ko có sự thay đổi gì thì hủy cập nhật.
    public boolean checkKhongTrungTrangThai(int rowSelected, String trangThaiSP) {
        String trangThaiOnTable = this.tbl_dssp.getValueAt(rowSelected, 4).toString();//dựa vào dòng đang chọn sản phẩm xem có trùng trạng thái không
        return !trangThaiOnTable.equals(trangThaiSP);
    }

    //check tên SP ko đc là số hoặc ký tự đặc biệt 
    public boolean checkKhongLaSo_KyTuDacBiet(String input) {
        String regex = "^[a-zA-Z\\p{L}\\s]+$";// xem có chứa ký tự đặc biệt/số hay ko.
        return input.matches(regex);
    }

    //chekc tên sản phẩm không dài quá 50 ký tự
    public boolean checkTenSP_KhongDaiQua30(String input) {
        return input.length() < 30;
    }

    //------------CÁC PHƯƠNG THỨC BỔ TRỢ CHO GIAO DIỆN SP
    //----------------------------------------------------
    public int returnSTT_By_TrangSP() {//Dựa vào đang ở trang mấy mà fill stt tương ứng.
        int i = 1;

        for (int page = 2; page <= TrangSP; page++) {
            i += 5;
        }
        return i;
    }

    public void CountSoTrangSP() {//Đếm số bản ghi của bảng SP để thực hiện xem nên có bao nhiêu trang
        countSBG_SP = prd.getSoBanGhiAllSP();
        if (countSBG_SP % 5 == 0) {
            soTrangSP = countSBG_SP / 5;
        } else {
            soTrangSP = countSBG_SP / 5 + 1;
        }
    }

    public void CountSoTrangSPTheoTrangThaiDePhanTrang(String trangThai) {//Thực hiện đếm 1 lần khi khởi chạy SP
        countSBG_SP = prd.countSoBanGhi(trangThai);
        if (countSBG_SP % 5 == 0) {
            soTrangSP = countSBG_SP / 5;
        } else {
            soTrangSP = countSBG_SP / 5 + 1;
        }
    }

    public void search(String str, DefaultTableModel dtmTable, JTable table) {
        dtmTable = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtmTable); //Tạo 1 TablerowSorter và liên kết với bảng DTM. TableRowSoft : Quản lý việc sắp xếp và lọc các hàng trong JTable.
        table.setRowSorter(trs); //Gán TableRowSorter vừa tạo cho JTable. -> Kích hoạt việc sắp xếp và lọc cho JTable. 
        //Sử dụng biểu thức chính quy để không phân biệt chữ hoa chữ thường
        Pattern pattern = Pattern.compile(Pattern.quote(str), Pattern.CASE_INSENSITIVE);
//        trs.setRowFilter(RowFilter.regexFilter(str));//Đặc bộ lọc cho TableRowSorter để thực hiện tìm kiếm dựa trên biểu thức chính quy ( Regex ). Nó sẽ tạo 1 bộ lọc dựa trên chuỗi str.
        trs.setRowFilter(new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Object> entry) {
                // Duyệt qua từng cột trong hàng
                for (int i = entry.getValueCount() - 1; i >= 0; i--) {
                    Object value = entry.getValue(i);
                    if (value != null) {
                        // Kiểm tra nếu giá trị của cột chứa ký tự tìm kiếm
                        Matcher matcher = pattern.matcher(value.toString());
                        if (matcher.find()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        });
    }

    //Từ ID_SP mà fill tất cả dữ liệu lên thông tin sản phẩm ( Ảnh + thông tin SP + quá trình theo dõi).
    public void fillThongTinSPByID_SP(int id_SPCT) {//Danh cho sau khi Update 1 SP
        TenGiay sp = prd.selectById(String.valueOf(id_SPCT));
        getName_ImageIcon_By_IDSP_With_SPCT_MaxQuantity(sp.getId());
        txt_tenSP.setText(sp.getName());
        cbb_trangThaiSP.setSelectedItem(sp.getStatus());
        setQuaTrinhTheoDoiSP(id_SPCT);//Fill dữ liệu lên bảng quá trình theo dõi dựa theo ID_Tên.SP
    }
    //Thực hiện fill tên người tạo/ngưởi sửa lên phần quá trình theo dõi dựa theo id_Của SP

    //Từ ID_SP lấy ra 1 đối tượng của SPCT có SL nhiều nhất và lấy ảnh của nó dựa vào id_Anh
    //Lấy ra tên ảnh dựa vào id_TenSP
    public void getName_ImageIcon_By_IDSP_With_SPCT_MaxQuantity(int id_tenSP) { //Lấy ra tên ảnh
        Ispct spct = prdd.select_SPCT_To_LayNameAnh_ById__SP(id_tenSP);
        if (spct != null && spct.getNameanh() != null) {//check TH ko lấy ra đối tượng thì ko có avatar phù hợp ( hoặc nói là ko có đối tượng nào ).
            Image img = Ximage.getImageIcon("/Product_images", spct.getNameanh()).getImage().getScaledInstance(270, 260, Image.SCALE_SMOOTH);
            ImageIcon imgIcon = new ImageIcon(img);
            lbl_avatar.setText(null);
            lbl_avatar.setIcon(imgIcon);
        } else {
            lbl_avatar.setIcon(null);
            lbl_avatar.setText("Ko có ảnh cho SP này");
        }
    }

    public void setQuaTrinhTheoDoiSP(int id_SP) {
        TenGiay tg = prd.getCreate_Update_By_ID_tenSP(id_SP);//truy vấn 1 TenGiay theo id_TenGiay
        if (tg != null) {
            txt_maSP.setText("SP-00" + id_SP);
            txt_nguoiTaoSP.setText(tg.getCreateByString()); //Tên người tạo SP 
            txt_ngayTaoSP.setText(tg.getCreate_At().toString());

            String capNhatBoi = (tg.getUpdateByString() != null && !tg.getUpdateByString().isEmpty()) ? tg.getUpdateByString() : "Chưa cập nhật lần nào";
            txt_nguoiSuaSP.setText(capNhatBoi);
            String ngayCapNhat = (tg.getUpdate_At() != null) ? tg.getUpdate_At().toString() : "....";
            txt_ngayCapNhatSP.setText(ngayCapNhat);
        }
    }

    //Lấy đối tượng để thêm Sản Phẩm.
    public TenGiay getProductByForm() {
        TenGiay prdLocal = new TenGiay();
        prdLocal.setName(txt_tenSP.getText());
        prdLocal.setStatus(null);
        return prdLocal;
    }

    //Mục đích : Thêm hiệu ứng "Chữ gợi ý" cho JTextField = cách thay đổi font = kiểu in nghiêng + màu chữ 
    public void addPlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();//Lấy font hiện tại của JTextField
        font = font.deriveFont(Font.ITALIC);//Tạo 1 bản sao mới của Font với kiểu in nghiêng ( Italic )
        textField.setFont(font); //Đặt font mới cho JTextField
        textField.setForeground(Color.GRAY); //Đặt màu chữ là Gray ( Xám ) 
    }

    //Mục đích : Loại bỏ hiệu ứng "Chữ gợi ý" khỏi JTextField.
    public void removePlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }

    //Thực hiện heightLight cho thành phần đc chọn trong bảng. 
    private static void setCustomRenderer(JTable table, int highlightRow) {
        table.setDefaultRenderer(Object.class,
                new DefaultTableCellRenderer() {
            private final int highlightRowInternal = highlightRow;

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                ((JLabel) component).setHorizontalAlignment(SwingConstants.CENTER);
                // Kiểm tra xem dòng có phải là dòng được chọn không
                if (isSelected || row == highlightRowInternal) {
                    // Nếu đúng, thiết lập màu nền highlight
                    component.setBackground(Color.CYAN);
                } else {
                    // Nếu không, sử dụng màu nền mặc định của dòng
                    component.setBackground(table.getBackground());
                }
                return component;
            }
        }
        );
    }

    //Dựa vào dòng đc chọn và cột ở bảng SPCT trả về đối tượng String
    public String getValueWithRowSelected_Column_OnTable_SPCT(int rowSelected, int column) {
        String value = this.tbl_SPCT4.getValueAt(rowSelected, column).toString().trim();
        return value;
    }

    public void clearSP() {
        txt_maSP.setText(null);
        txt_tenSP.setText(null);
        addPlaceholderStyle(txt_tenSP); //Thay đổi font chữ
        txt_tenSP.setText("Nhập tên sản phẩm"); //Hiện chữ ẩn
        lbl_avatar.setIcon(null);
        txt_nguoiTaoSP.setText(null);
        txt_nguoiSuaSP.setText(null);
        txt_ngayTaoSP.setText(null);
        txt_ngayCapNhatSP.setText(null);
    }

    public void clearSPCT() {//Thực hiện clear hết tất cả các trường và đặt lại cbb ở UI_SPCT.
        if (dcbThuongHieu != null && cbb_kichThuoc != null && cbb_mauSac != null && cbb_chatLieu != null && cbb_deGiay != null && cbb_dayGiay != null) {
            txt_soLuong.setText(null);
            txt_giaBan.setText(null);
            ta_moTa.setText(null);
            txt_maSPCT.setText(null);
            cbb_thuongHieu.setSelectedIndex(0);
            cbb_kichThuoc.setSelectedIndex(0);
            cbb_mauSac.setSelectedIndex(0);
            cbb_chatLieu.setSelectedIndex(0);
            cbb_deGiay.setSelectedIndex(0);
            cbb_dayGiay.setSelectedIndex(0);
        }
    }

//----------------------------SẨN PHẨM CHI TIẾT-------------------------------------------        
    public void initSPCT() {
        fill_TenSP_To_Cbb_Theo_SL_GiamDan();//thêm tên SPCT vào cbb.
        fill_ThuongHieu_To_Cbb();//Thêm thương hiệu vào cbb
        fill_KichThuoc_To_Cbb();//Thêm Kích Cỡ vào cbb
        fill_MauSac_To_Cbb();//Thêm Màu sắc vào cbb
        fill_ChatLieu_To_Cbb();//Thêm Chất liệu vào cbb
        fill_DeGiay_To_Cbb();//Thêm Đề Giày vào cbb
        fill_DayGiay_To_Cbb();//Thêm Dây Giày vào cbb
        setCustomRenderer(this.tbl_SPCT4, -1);
    }

    public void fill_ALL_SPCT_To_Table() {//Đẩy tất cả SPCT lên Bảng SPCT ---- dang dùng cho rdo_Hiện thị tất cả SPCT
        List<Ispct> listSPCT = prdd.selectAll(); //Truy vấn tất cả SPCT với xóa mêm là 0. = chưa bị xóa
        Model_fill_SPCT_To_Table(listSPCT);        //Fill lên bảng danh sách SPCT
    }

    public void fill_TenSP_To_Cbb() {//Thêm tất cả Tên Giày vào ComboBox theo giảm dần của create_at SPCT
        dcbmdTenSP = (DefaultComboBoxModel) this.cbb_tenSP.getModel();
        dcbmdTenSP.removeAllElements();
        List<TenGiay> listTG = prd.select_TenSP_Create_at_GiamDan();
        for (TenGiay tg : listTG) {
            dcbmdTenSP.addElement(tg.getName());
        }
    }

    public void fill_TenSP_To_Cbb_Theo_SL_GiamDan() {//Thêm tất cả Tên Giày vào ComboBox theo giảm dần của SL SPCT
        dcbmdTenSP = (DefaultComboBoxModel) this.cbb_tenSP.getModel();
        dcbmdTenSP.removeAllElements();
        List<TenGiay> listTG = prd.select_TenSP_SL_GiamDan();
        for (TenGiay tg : listTG) {
            dcbmdTenSP.addElement(tg.getName());
        }
    }

    public void fill_ThuongHieu_To_Cbb() {//Đổ tất cả Thường hiệu vào Cbb vs trạng thái 'Đang áp dụng'
        dcbThuongHieu = (DefaultComboBoxModel) this.cbb_thuongHieu.getModel();
        dcbThuongHieu.removeAllElements();
        List<ThuongHieu> listTH = thd.selectAll();
        for (ThuongHieu TH : listTH) {
            dcbThuongHieu.addElement(TH.getName());
        }
    }

    public void fill_KichThuoc_To_Cbb() {//Đổ tất cả Kích Cỡ vào Cbb vs trạng thái 'Đang áp dụng'
        dcbKichThuoc = (DefaultComboBoxModel) this.cbb_kichThuoc.getModel();
        dcbKichThuoc.removeAllElements();
        List<KichCo> listKC = kcd.selectAll();
        for (KichCo KC : listKC) {
            dcbKichThuoc.addElement(KC.getName());
        }
    }

    public void fill_MauSac_To_Cbb() {//Đổ tất cả Màu Sắc vào Cbb  vs trạng thái 'Đang áp dụng'
        dcbMauSac = (DefaultComboBoxModel) this.cbb_mauSac.getModel();
        dcbMauSac.removeAllElements();
        List<MauSac> listMS = msd.selectAll();
        for (MauSac MS : listMS) {
            dcbMauSac.addElement(MS.getName());
        }
    }

    public void fill_ChatLieu_To_Cbb() {//Đổ tất Chât Liệu vào Cbb  vs trạng thái 'Đang áp dụng'
        dcbChatLieu = (DefaultComboBoxModel) this.cbb_chatLieu.getModel();
        dcbChatLieu.removeAllElements();
        List<ChatLieu> listCL = cld.selectAll();
        for (ChatLieu CL : listCL) {
            dcbChatLieu.addElement(CL.getName());
        }
    }

    public void fill_DeGiay_To_Cbb() {//Đổ tất cả Đế Giày vào Cbb  vs trạng thái 'Đang áp dụng'
        dcbDeGiay = (DefaultComboBoxModel) this.cbb_deGiay.getModel();
        dcbDeGiay.removeAllElements();
        List<HdeGiay> listDG = dgd.selectAll();
        for (HdeGiay DG : listDG) {
            dcbDeGiay.addElement(DG.getName());
        }
    }

    public void fill_DayGiay_To_Cbb() {//Đổ tất cả Dây giày vào Cbb  vs trạng thái 'Đang áp dụng'
        dcbDayGiay = (DefaultComboBoxModel) this.cbb_dayGiay.getModel();
        dcbDayGiay.removeAllElements();
        List<DayGiay> listDG = dgd2.selectAll();
        for (DayGiay DG : listDG) {
            dcbDayGiay.addElement(DG.getName());
        }
    }

//    //fill_SPCT_ByID_To_Table(int id) đag ko dùng tới
//    public void fill_SPCT_By_To_Table(String nameSP) {//Truy vấn SPCT theo ID SPCT khi click vào 1 đối tượng ở bảng dssp. 
//        List<Ispct> listSPCT = prdd.select_ALL_SPCT_By_TenSP(nameSP);
//        Model_fill_SPCT_To_Table(listSPCT);
//    }
    public void fill_SPCT_ByName_To_Table(String Name) {//Truy vấn SPCT theo Name SPCT ( Dành cho Cbb ) 
        List<Ispct> listSPCT = prdd.select_ALL_SPCT_By_Name(Name);
        Model_fill_SPCT_To_Table(listSPCT);
    }

    public List<Ispct> GetList_SPCT_ByName_Width5Object_To_Table(int trang) {//Thực hiện truy vấn số SPCT theo số trang
        String tenGiay = cbb_tenSP.getSelectedItem().toString(); //Lấy tên Sản phẩm đang chọn
        List< Ispct> listSPCT_With5Object = prdd.get5Object_ByTrang(tenGiay, trang);
        return listSPCT_With5Object;
    }

    public int returnSTT_By_Trang() {
        int i = 1;
        for (int page = 2; page <= Trang; page++) {
            i += 5;
        }
        return i;
    }

    //Mô đun đẩy danh sách SPCT lên bảng dựa vào dánh sách truyền vào.
    public void Model_fill_SPCT_To_Table(List<Ispct> listSPCT) {
        dtmDSSPCT = (DefaultTableModel) this.tbl_SPCT4.getModel();
        dtmDSSPCT.setRowCount(0);
        int i = returnSTT_By_Trang();
        for (Ispct ispct : listSPCT) {
            Object[] data = new Object[]{
                i++, //STT
                ispct.getNametenGiay(), //Tên SPCT
                "SPCT-" + ispct.getId(), //ID_SPCT
                ispct.getNamethuongHieu(), //NameThuongHieu
                ispct.getNamekichCo(), //NameKichCo
                ispct.getNamemauSac(), //NameMauSac
                ispct.getNamechatLieu(), //NameChatLieu
                ispct.getNamedeGiay(),
                ispct.getNamedayGiay(), //Name
                ispct.getSoLuong(),
                formatNumber(ispct.getGiaBan()) + ",000đ",
                ispct.getMoTa()
            };
            dtmDSSPCT.addRow(data);
        }
    }

    public IspctInsert getSPCT_IDTT() {
        IspctInsert spctInsert = new IspctInsert();
        int rowSelected = this.tbl_SPCT4.getSelectedRow(); //Dòng đc chọn để Update : Lấy Id_SPCT update
        if (rowSelected != -1) {//Khi update thì rowSelected phải khác 0
            int id_SPCT = Integer.valueOf(this.tbl_SPCT4.getValueAt(rowSelected, 2).toString().substring(5)); //Lấy ID_SPCT trên tbl và ép kiểu
            spctInsert.setId_SPCT(id_SPCT);//Thiết lập giá trị cho SPCT
//            System.out.println("ID_SPCT " + id_SPCT);
        }

        spctInsert.setId_tenGiay(getMaThuocTinhToName("danh sách tên sản phẩm", cbb_tenSP.getSelectedItem().toString(), TenGiay.class
        ));
//        System.out.println("ID_Tên.SP " + spctInsert.getId_tenGiay());

        spctInsert.setId_thuongHieu(getMaThuocTinhToName("danh sách thương hiệu", dcbThuongHieu.getSelectedItem().toString(), ThuongHieu.class
        ));
//        System.out.println("ID_Thương Hiệu " + spctInsert.getId_thuongHieu());

        spctInsert.setId_kichThuoc(getMaThuocTinhToName("danh sách kích thước", dcbKichThuoc.getSelectedItem().toString(), KichCo.class
        ));
//        System.out.println("ID_Kích Thước " + spctInsert.getId_kichThuoc());

        spctInsert.setId_mauSac(getMaThuocTinhToName("danh sách màu sắc", dcbMauSac.getSelectedItem().toString(), MauSac.class
        ));
//        System.out.println("ID_Màu_Sắc " + spctInsert.getId_mauSac());

        spctInsert.setId_chatLieu(getMaThuocTinhToName("danh sách chất liệu", dcbChatLieu.getSelectedItem().toString(), ChatLieu.class
        ));
//        System.out.println("ID_Chất Liệu " + spctInsert.getId_chatLieu());

        spctInsert.setId_deGiay(getMaThuocTinhToName("danh sách đế giày", dcbDeGiay.getSelectedItem().toString(), HdeGiay.class
        ));
//        System.out.println("ID_Đế Giày " + spctInsert.getId_deGiay());

        spctInsert.setId_dayGiay(getMaThuocTinhToName("danh sách dây giày", dcbDayGiay.getSelectedItem().toString(), DayGiay.class
        ));
//        System.out.println("ID_Dây Giày " + spctInsert.getId_dayGiay());
        spctInsert.setId_anh(-1); //Mặc định insert ở đây là -1 : Là ko có ảnh
        spctInsert.setSoLuong(Integer.valueOf(txt_soLuong.getText()));//SỐ LƯỢNG

        String giaBanStr = txt_giaBan.getText().trim(); //Bỏ khoảng trắng
        Double giaBanDouble = Double.valueOf(giaBanStr); //Ép ra double ( Giá do người dùng nhập vào là số nên ko có dấu ',' hoặc '.' nên thường sẽ ko lỗi
        spctInsert.setGiaBan(BigDecimal.valueOf(giaBanDouble));//Ép ra BigDecimal 

        spctInsert.setMoTa(ta_moTa.getText());   // MÔ TẢ 

        spctInsert.setMaQR("Mã.QR_Null");
        spctInsert.setCreate_by(GetChucVu.getId());  //NGƯỜI TẠO ( Insert ) 
        spctInsert.setUpdate_by(GetChucVu.getId());  //NGƯỜI SỬA ( Update )

        spctInsert.setTrangThai("Ðang Kinh Doanh"); //TRẠNG THÁI dựa vào số lượng của SPCT dù Insert ( Update ko có vì nếu nó là 0 thì ko thể nào update đc ? ) 
        spctInsert.setDeleted(0);//xóa mềm bằng 0 là chưa xóa. 1 là xóa r ( true )

        return spctInsert;
    }

//---------------- Validate SPCT 
    public boolean checkKhongNull_SPCT(String soLuongTonSPCT, String giaBanSPCT) {
        if (soLuongTonSPCT.isEmpty() || giaBanSPCT.isEmpty()) {
            String message = (soLuongTonSPCT.isEmpty()) ? "Y/c không để trống số lượng" : "Y/c không để trống giá bán";
            MsgBox.alter(this, message);
            return false; // Trả về false nếu có ít nhất một trường trống
        }
        return true;// Nếu không có trường nào trống, trả về true
    }

    public boolean checkANumber_SPCT(String soLuongTonSPCT, String giaBanSPCT) {
        boolean isSoLuongValid = isNumeric(soLuongTonSPCT);
        boolean isGiaBanValid = isNumeric(giaBanSPCT);
        if (!isSoLuongValid || !isGiaBanValid) { //Nếu SLT || Giá bán ko là số
            StringBuilder message = new StringBuilder("Yêu cầu nhập ");
            if (!isSoLuongValid) {//nếu SLT ko là số
                message.append(" số lượng tồn SPCT");
            }
            if (!isGiaBanValid) {//Nếu Giá Bán ko là số 
                if (!isSoLuongValid) { //Thực hiện gộp "Và" nếu cả 2 ko là số
                    message.append(" và ");
                }
                message.append("giá bán SPCT ");
            }
            message.append(" là số");
            MsgBox.alter(this, message.toString().trim());
            return false;
        }
        return true;//Nếu cả 2 là số
    }

    public boolean isNumeric(String str) { //Chek xem có phải là số ko. Bổ trợ cho Method  checkANumber_SPCT()
        try {
            Double.valueOf(str);
            return true;//Là số
        } catch (NumberFormatException e) {
            return false;//Ko là số
        }
    }

    public boolean checkSoHopLe(String soLuongTonSPCT, String giaBanSPCT) {//Phải là số dương và hợp lý về sl và giá tiền.
        if (soLuongTonSPCT.length() > 3) {
            System.out.println(soLuongTonSPCT.length());
            MsgBox.alter(this, "Số lượng Sản phẩm < 999 chiếc");
            return false;
        } else if (giaBanSPCT.length() > 5) {
            MsgBox.alter(this, "Giá bản sản phảm phải hợp lệ ( < 99999 Ngìn )");
            System.out.println(giaBanSPCT.length());
            return false;
        } else if (Double.valueOf(soLuongTonSPCT.trim()) <= 0 || Double.valueOf(giaBanSPCT.trim()) <= 0) {
            MsgBox.alter(this, "Yêu cầu nhập số lượng tồn/giá bán > 0");
            return false;
        }
        return true;//Nếu lớn hơn ko là hợp lệ là số
    }

    //Khi thực hiện update nó so sánh đối tượng update vs tất cả đối tượng trong DB cùng tên. Nếu tất cả thuộc tính của update trùng vs 1 đối tượng cùng tên trog DB thì ko update
    public int checkKhongTrungTatCaThuocTinh_KhiInsert_SPCT(String thuongHieu, String kichThuoc, String mauSac, String chatLieu, String deGiay, String DayGiay) {
        int id = -1; //ban đầu chưa có cái nào trùng. Xét xem có trùng hay ko và idSPCT trùng tất cả thuộc tính là IDspct nào. 
        List<Ispct> listSPCT_ByName = prdd.select_ALL_SPCT_By_Name(dcbmdTenSP.getSelectedItem().toString());//Lấy tất cả SP theo tên đang chọn trên Cbb Sản phẩm
        for (Ispct spct : listSPCT_ByName) {
            boolean trungThuongHieu = thuongHieu.equals(spct.getNamethuongHieu());
            boolean trungKichCo = kichThuoc.equals(spct.getNamekichCo());
            boolean trungMauSac = mauSac.equals(spct.getNamemauSac());
            boolean trungChatLieu = chatLieu.equals(spct.getNamechatLieu());
            boolean trungDeGiay = deGiay.equals(spct.getNamedeGiay());
            boolean trungDayGiay = DayGiay.equals(spct.getNamedayGiay());
            if (trungThuongHieu && trungKichCo && trungMauSac && trungChatLieu && trungDeGiay && trungDayGiay) {
                id = spct.getId();// Lưu trữ id sản phẩm trùng khớp
                break;// Thoát vòng lặp sau khi tìm thấy sản phẩm trùng khớp
            }
        }
        return id;//Nếu tất cả thuộc tính thêm mới không trùng thì trả về -1;
    }

    //check khi thực hiện update thì tất cả đều không trùng là được. Thì chỉ cần 1 trường thay đổi thì update thành công.
    public boolean checkKhongTrungSoLuong(int rowselected, String soLuongString) {
        return !this.tbl_SPCT4.getValueAt(rowselected, 9).toString().trim().equals(soLuongString);
    }

    public boolean checkKhongTrungGiaBan(int rowselected, String giaBanSring) {
        String giaBanOntable = this.tbl_SPCT4.getValueAt(rowselected, 10).toString().trim(); //Bỏ khoảng trắng
        String giaBanOnTable_BoDau_ChamPhay = giaBanOntable.replaceAll("\\,", "").replaceAll("đ", ""); //thay các dấu ',' bằng rỗng
        String giaBanOnTable_Bo3So_Khong = giaBanOnTable_BoDau_ChamPhay.replaceAll("000$", "");
        return !giaBanOnTable_Bo3So_Khong.equals(giaBanSring);//nếu không trùng trả về true.
    }

//--------------------- Utility SPCT
    public boolean checkTenThuocTinh_chiLaChuVaKhoangTrang(String input) {//Giống regex SP.
        String regex = "^[a-zA-Z\\p{L}\\s]+$";// xem có chứa ký tự đặc biệt/số hay ko.
        String message = (input.matches(regex)) ? "" : "Tên thuộc tính chỉ được là chữ và khoảng trắng.";
        MsgBox.alter(this, message);
        return input.matches(regex);
    }

    public void clearTTSP() {
        txt_maThuocTinh.setText(null);
        txt_tenThuocTinh.setText(null);
    }

    public int getSoTrangByCountSoBanGhi(int CountDB) {//Lấy ra số trang cần thiết dựa theo số bảng ghi.
        if (CountDB % 5 == 0) {
            soTrang = CountDB / 5;
        } else {
            soTrang = CountDB / 5 + 1;
        }
        return soTrang;
    }

    public void handleQuickInsert_TenSP(String inputPrompt) {//Thực hiện thêm nhanh SP
        String inputValue = MsgBox.prompt(this, inputPrompt); //Giá trị nhập vào ô thêm SP Nhanh
        if (inputValue != null && !inputValue.isEmpty() && checkKhongTonTaiChoSP(inputValue.trim()) && checkKhongLaSo_KyTuDacBiet(inputValue) && checkTenSP_KhongDaiQua30(inputValue)) {
            TenGiay tg = getTenSPInsert(inputValue);
            prd.insert(tg);
            MsgBox.alter(this, "Thêm SP Thành Công");
            fill_TenSP_To_Cbb();//Fill lại lên Combobox đối tượng SP mới thêm 
        } else if (inputValue != null && !inputValue.isEmpty() && !checkKhongLaSo_KyTuDacBiet(inputValue)) {
            MsgBox.alter(this, "Tên SP phải là chữ và có khoảng trắng.Không được chứa ký tự đặc biệt");
        } else if (inputValue != null && !inputValue.isEmpty() && !checkTenSP_KhongDaiQua30(inputValue)) {
            MsgBox.alter(this, "Tên SP ko dài quá 30 ký tự");
        } else {
            // Nếu người dùng bấm Cancel hoặc không nhập gì, hiển thị thông báo tương ứng
            String message = (inputValue == null) ? "Hủy thêm nhanh" : "Thêm thất bại do chưa nhập tên_SP hoặc Tên_SP đã tồn tại ";
            MsgBox.alter(this, message);
        }
    }

    public static String formatNumber(BigDecimal number) {
        //Tạo một đối tượng NumberFormat với Locale.US để sử dụng định dạng tiền tệ của Hoa Kỳ
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        // Định dạng số
        return numberFormat.format(number);//Định dạng số và chuyển nó thành String.
    }

    public static String formatNumber_BoDauCham(BigDecimal number) {//Bỏ đi dấu chấm của số.
        return number.toString().replace(".", "");
    }

//--------------------Dựa vào Tên_Thuộc.Tính ( Name_TT ) trả về ID tương ứng.
    //Dựa vào nameList duyệt và name_TT để tìm ra ID_TT  tương ứng trên danh sách nameList.
    public <T extends interfaceModels> int getMaThuocTinhToName(String nameList, String name_TT, Class<T> objectType) {
        //Tạo 1 Map chứa tên hiển thị của các thuộc tính cần kiểm tra và ComboBoxModel tương ứng
        Map< String, List<?>> ListModels = new HashMap<>();
        //Phương thức Put() để thêm 1 cặp key-value vào Map
        //Dựa vào NAMELIST tương ứng cho ra LIST tương ứng để duyệt tìm id
        ListModels.put("danh sách tên sản phẩm", prd.selectAll()); //Đối tượng tên giày
        ListModels.put("danh sách thương hiệu", thd.selectAll()); //Đối tượng thương hiệu
        ListModels.put("danh sách kích thước", kcd.selectAll()); //Đối tượng kích cỡ
        ListModels.put("danh sách màu sắc", msd.selectAll()); //Đối tượng màu sắc
        ListModels.put("danh sách chất liệu", cld.selectAll()); //Đối tượng chất liệu
        ListModels.put("danh sách đế giày", dgd.selectAll()); //Đối tượng đế giày
        ListModels.put("danh sách dây giày", dgd2.selectAll()); //Đối tượng dây giày
        //Lấy nameList tương ứng dựa vào 
        List<?> ListTT_TuongUng = ListModels.get(nameList); //Dựa vào nameList lấy ra danh sách tương ứng.
        if (ListTT_TuongUng != null) {//Check xem dựa vào key có value nào ko ( Danh sách )
            for (int i = 0; i < ListTT_TuongUng.size(); i++) {
//Do obj là đối tượng trong List nhưng kiểu của List ko đc chỉ định. 
//Nên khi lấy đối tượng từ danh sách.
//Thì java chỉ biết nó là 1 đối tượng nhưng ko có thông tin cụ thể về đối tượng đó.
                Object obj = ListTT_TuongUng.get(i);//Lấy đối tượng ở dòng thứ vị trí thứ i trong danh sách.
                T typedObject = objectType.cast(obj);//ép kiểu đối tượng sang kiểu objectType 
//                System.out.println("lần thứ " + i + " " + typedObject.getName_TT_Insert());
                if (String.valueOf(typedObject.getName_TT_Insert()).equals(name_TT)) {//So Sánh : Name đối tượng lần thứ i : có trùng với Name ở Combobox không
//                    System.out.println("ID trùng : " + typedObject.getId_TT_Insert());
                    return typedObject.getId_TT_Insert();//Nếu trùng thì lấy ID_TT tương ứng của đối tượng đó.
                }
            }
        }
        MsgBox.alter(this, "Nếu ko tìm thấy dánh sách thích hơp || từ Name_TT ko suy ra đc ID_TT thì trả về là -1");
        return -1;//Nếu ko tìm thấy dánh sách thích hơp || từ Name_TT ko suy ra đc ID_TT thì trả về là -1
    }

//----------------------------THUỘC TÍNH-------------------------------------------  
    private void initTTSP() {//Khi khởi động chạy giao diện
        fill_KichCo_ToTable();
        setCustomRenderer(this.tbl_TTSP, -1);
    }
//------------------------------CheckValidation + utility của Thuộc Tính----------------------------------------

    public boolean checkHopLyKichThuoc35_45(String input) {
        int sizeGiay = Integer.valueOf(input);//check size giày chỉ từ 35 đến 45
        String message = (sizeGiay >= 35 && sizeGiay <= 45) ? "" : " size giày phải >= 35 hoặc <= 45";
        MsgBox.alter(this, message);
        return sizeGiay >= 35 && sizeGiay <= 45;
    }

    public boolean checkNullThuocTinh() {//Nếu txt_TenThuocTinh rỗng thì auto Null
        boolean itNotNull = !txt_tenThuocTinh.getText().isEmpty();
        if (!itNotNull) {
            MsgBox.alter(this, "Y/C nhập tên thuộc tính");
        }
        return itNotNull;
    }

    public boolean checkNotNumber(String kichCo) {//dựa vào tham số truyền vào kiểm tra xem có phải là số không
        try {
            Integer.valueOf(kichCo.trim());
            if (Integer.valueOf(kichCo.trim()) <= 0) {
                MsgBox.alter(this, "Kích cỡ giày  >  0");
                return false;
            } else if (kichCo.length() >= 4) {
                MsgBox.alter(this, "Tên kích cỡ giày không quá 5 ký tự");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            MsgBox.alter(this, "Y/C nhập tên thuộc tính kích cỡ là số");
            return false;
        }
    }

    public boolean checkKhongTonTaiThuocTinh() {//dựa vào Txt_TenThuocTinh mà xét nó đã tồn tại hay chưa
        String TenThuocTinhInput = txt_tenThuocTinh.getText().trim(); //Tên thuộc tính nhập vào
        for (int i = 0; i < dtmDSTT.getRowCount(); i++) {//Duyệt các dòng của Bảng thuộc tính SP
            String TenThuocTinhTable = this.tbl_TTSP.getValueAt(i, 1).toString();
            if (TenThuocTinhTable.equalsIgnoreCase(TenThuocTinhInput)) {
                MsgBox.alter(this, "Tên thuộc tính " + TenThuocTinhInput + " đã tồn tại ");
                return false;//Tồn tại là False
            }
        }
        return true;//Chưa tồn tại là true
    }

    public void clearnThuocTinh() {
        txt_maThuocTinh.setText(null);
        txt_tenThuocTinh.setText(null);
        this.tbl_TTSP.clearSelection();//Xóa bỏ sự kiện highLight ( Dòng đã chọn )   
    }

    private void handleQuickInsert(String inputPrompt) {//Tham số truyền vào là thông báo giá trị nhập cho thuộc tính nào
        //Hiện thị hộp thoại user nhập giá trị thuộc tính
        String inputValue = MsgBox.prompt(this, inputPrompt);
        if (inputValue != null && !inputValue.isEmpty() && checkTonTaiThemNhanhThuocTinh(inputValue.trim(), inputPrompt)) {
            //tùy thuộc vào loại thuộc tính thêm nhanh <=> Thực hiện các bước tương ứng.
            if (inputPrompt.contains("thương hiệu")) {
                //gọi method thêm thương hiệu
                insertThuongHieu(inputValue.trim());
                // Cập nhật bảng và ComboBox cho thương hiệu
                fill_ThuongHieu_ToTable();
                fill_ThuongHieu_To_Cbb();
            } else if (inputPrompt.contains("kích thước")) {
                if (checkNotNumber(inputValue)) {//Kiểm tra tham số nhập vào có phải là số ko
                    insertKichThuoc(inputValue.trim());
                    fill_KichCo_ToTable(); //Đẩy lại danh sách kích thước lên bảng 
                    fill_KichThuoc_To_Cbb(); //Đẩy lại danh sách kích thước lên Cbb
                } else {
                    inputValue = null;
                }
            } else if (inputPrompt.contains("màu sắc")) {
                insertMauSac(inputValue);
                fill_MauSac_ToTable();
                fill_MauSac_To_Cbb();
            } else if (inputPrompt.contains("chất liệu")) {
                insertChatLieu(inputValue.trim());
                fill_ChatLieu_ToTable();
                fill_ChatLieu_To_Cbb();
            } else if (inputPrompt.contains("đế giày")) {
                insertDeGiay(inputValue.trim());
                fill_DeGiay_ToTable();
                fill_DeGiay_To_Cbb();
            } else if (inputPrompt.contains("dây giày")) {
                insertDayGiay(inputValue.trim());
                fill_DayGiay_ToTable();
                fill_DayGiay_To_Cbb();
            } else {
                MsgBox.alter(this, "Thêm thất bại??");
            }
        } else {
            // Nếu người dùng bấm Cancel hoặc không nhập gì, hiển thị thông báo tương ứng
            String message = (inputValue == null) ? "Hủy thêm nhanh" : "Thêm thất bại do chưa nhập giá trị hoặc giá trị đã tồn tại ";
            MsgBox.alter(this, message);
        }
    }

    //Cần xác định xem thuộc tính inputValue này sẽ so với danh sách Cbb nào để xét tồn tại
    private boolean checkTonTaiThemNhanhThuocTinh(String inputValue, String inputPrompt) {
        //Tạo 1 Map chứa tên hiển thị của các thuộc tính cần kiểm tra và ComboBoxModel tương ứng
        Map<String, DefaultComboBoxModel<String>> comboBoxModels = new HashMap<>();
        //Phương thức Put() để thêm 1 cặp key-value vào Map
        comboBoxModels.put("Nhập tên thương hiệu thêm nhanh", dcbThuongHieu); //Dựa vào inputPrompt tương ứng cho ra DFComboBox tương ứng
        comboBoxModels.put("Nhập tên kích thước thêm nhanh", dcbKichThuoc);
        comboBoxModels.put("Nhập tên màu sắc thêm nhanh", dcbMauSac);
        comboBoxModels.put("Nhập tên chất liệu thêm nhanh", dcbChatLieu);
        comboBoxModels.put("Nhập tên đế giày thêm nhanh", dcbDeGiay);
        comboBoxModels.put("Nhập tên dây giày thêm nhanh", dcbDayGiay);
        //Lấy DFComboBoxModel tương ứng với tham số Value thêm vào ( inputPrompt ) 
        DefaultComboBoxModel comboBoxModel = comboBoxModels.get(inputPrompt);
        if (comboBoxModel != null) {
            for (int i = 0; i < comboBoxModel.getSize(); i++) {//duyệt qua từng phần tử kiểm tra sự tồn tại
                //Nếu phần tử nhập tồn tại trong ComboBoxModel trả về false
                if (inputValue.equalsIgnoreCase(comboBoxModel.getElementAt(i).toString().trim())) {
                    MsgBox.alter(this, "Thuộc tính : " + inputValue + " đã tồn tại");
                    return false;
                }
            }
            return true;//Giá trị nhập ko tồn tại trả về true.
        }
        System.out.println("Ko tìm thấy Model phù hợp ở method checkTonTaiThemNhanhThuocTinh");
        return false;//Nếu ko tìm thấy ComboBoxModel cho thuộc tính cần kiểm tra, trả về false
    }

//-----------------------------------End Validation
//-----------------------------------Fill/Insert/Update Của Kích Cỡ 
    public void fill_KichCo_ToTable() {
        KichCoDAO kcd = new KichCoDAO();
        dtmDSTT = (DefaultTableModel) this.tbl_TTSP.getModel();
        dtmDSTT.setRowCount(0);
        List<KichCo> kc = kcd.selectAll();// vs trạng thái 'Đang áp dụng'
        for (KichCo KC : kc) {
            Object[] row = new Object[]{
                KC.getId(),
                KC.getName(),};
            dtmDSTT.addRow(row);
        }
    }

    //Khi insert thì chỉ cần Name và Status.
    public void insertKichThuoc(String nameThuocTinh) {//Thực hiện lấy đối tượng Kích Cỡ && insert vào CSDL && Thông Báo
        KichCo kc = new KichCo();
        kc.setName(Integer.valueOf(nameThuocTinh.trim()));
        kc.setStatus("Đang áp dụng");
        kc.setCreate_by(GetChucVu.getId());
        kcd.insert(kc);
        MsgBox.alter(this, "Thêm kích cỡ " + nameThuocTinh + " thành công");
    }

    public void updateKichThuoc(int rowSelected) {//Tạo đối tượng Update dựa vào thông tin dòng lấy.
        KichCo kc = new KichCo();
        kc.setId(Integer.valueOf(this.tbl_TTSP.getValueAt(rowSelected, 0).toString().trim()));//Lấy id dựa vào dòng đc chọn
        kc.setName(Integer.valueOf(txt_tenThuocTinh.getText().trim()));//Lấy name dựa vào tham số truyền vào.
        kc.setUpdate_by(GetChucVu.getId());//Lấy id Nhân viên update
        kcd.update(kc);
        MsgBox.alter(this, "Update kích thước thành công");
    }

//-----------------------------------Fill/Insert/Update Của Chất Liệu
    public void fill_ChatLieu_ToTable() {
        ChatLieuDAO cld = new ChatLieuDAO();
        dtmDSTT = (DefaultTableModel) this.tbl_TTSP.getModel();
        dtmDSTT.setRowCount(0);
        List<ChatLieu> cl = cld.selectAll(); // vs trạng thái 'Đang áp dụng'
        for (ChatLieu CL : cl) {
            Object[] row = new Object[]{
                CL.getId(),
                CL.getName(),};
            dtmDSTT.addRow(row);
        }
    }

    public void insertChatLieu(String NameThuocTinh) {//Tạo đối tượng chất liệu dự vào Txt_TenThuocTinh + Status
        ChatLieu chatLieu = new ChatLieu();
        chatLieu.setName(NameThuocTinh.trim());
        chatLieu.setStatus("Đang áp dụng");
        chatLieu.setCreate_by(GetChucVu.getId());
        cld.insert(chatLieu);
        MsgBox.alter(this, "Thêm chất liệu " + NameThuocTinh + " thành công!");
    }

    public void updateChatLieu(int rowSelected) {
        ChatLieu cl = new ChatLieu();
        cl.setId(Integer.valueOf(this.tbl_TTSP.getValueAt(rowSelected, 0).toString().trim()));//Lấy id dựa vào dòng đc chọn
        cl.setName(txt_tenThuocTinh.getText().trim());//Lấy name dựa vào tham số truyền vào.
        cl.setUpdate_by(GetChucVu.getId());//Lấy id Nhân viên update
        cld.update(cl);
        MsgBox.alter(this, "Update Chất Liệu thành công");
    }
//-----------------------------------Fill/Insert/Update Của Màu Sắc

    public void fill_MauSac_ToTable() {
        MauSacDAO msd = new MauSacDAO();
        dtmDSTT = (DefaultTableModel) this.tbl_TTSP.getModel();
        dtmDSTT.setRowCount(0);
        List<MauSac> ms = msd.selectAll(); // vs trạng thái 'Đang áp dụng'
        for (MauSac MS : ms) {
            Object[] row = new Object[]{
                MS.getId(),
                MS.getName(),};
            dtmDSTT.addRow(row);
        }
    }

    public void insertMauSac(String NameThuocTinh) {//Tạo đối tượng chất liệu dự vào Txt_TenThuocTinh + Status
        MauSac mauSac = new MauSac();
        mauSac.setName(NameThuocTinh.trim());
        mauSac.setStatus("Đang áp dụng");
        mauSac.setCreate_by(GetChucVu.getId());
        msd.insert(mauSac);
        MsgBox.alter(this, "Thêm màu sắc " + NameThuocTinh + " thành công!");
    }

    public void updateMauSac(int rowSelected) {
        MauSac mauSac = new MauSac();
        mauSac.setId(Integer.valueOf(this.tbl_TTSP.getValueAt(rowSelected, 0).toString().trim()));//Lấy id dựa vào dòng đc chọn
        mauSac.setName(txt_tenThuocTinh.getText().trim());//Lấy name dựa vào tham số truyền vào.
        mauSac.setUpdate_by(GetChucVu.getId());//Lấy id Nhân viên update
        msd.update(mauSac);
        MsgBox.alter(this, "Update màu sắc thành công");
    }

//-----------------------------------Fill/Insert/Update Của Thương Hiệu
    public void fill_ThuongHieu_ToTable() {
        ThuongHieuDao thd = new ThuongHieuDao();
        dtmDSTT = (DefaultTableModel) this.tbl_TTSP.getModel();
        dtmDSTT.setRowCount(0);
        List<ThuongHieu> th = thd.selectAll(); // vs trạng thái 'Đang áp dụng'
        for (ThuongHieu TH : th) {
            Object[] row = new Object[]{
                TH.getId(),
                TH.getName(),};
            dtmDSTT.addRow(row);
        }
    }

    public void insertThuongHieu(String NameThuocTinh) {//Tạo đối tượng chất liệu dự vào Txt_TenThuocTinh + Status
        ThuongHieu thuongHieu = new ThuongHieu();
        thuongHieu.setName(NameThuocTinh.trim());
        thuongHieu.setStatus("Đang áp dụng");
        thuongHieu.setCreate_by(GetChucVu.getId());
        thd.insert(thuongHieu);
        MsgBox.alter(this, "Thêm Thương Hiệu " + NameThuocTinh + " thành công!");
    }

    public void updateThuongHieu(int rowSelected) {
        ThuongHieu thuongHieu = new ThuongHieu();
        thuongHieu.setId(Integer.valueOf(this.tbl_TTSP.getValueAt(rowSelected, 0).toString().trim()));//Lấy id dựa vào dòng đc chọn
        thuongHieu.setName(txt_tenThuocTinh.getText().trim());//Lấy name dựa vào tham số truyền vào.
        thuongHieu.setUpdate_by(GetChucVu.getId());//Lấy id Nhân viên update
        thd.update(thuongHieu);
        MsgBox.alter(this, "Update Thương Hiệu thành công");
    }

//-----------------------------------Fill/Insert/Update Của Đế Giày
    public void fill_DeGiay_ToTable() {
        DeGiayDao dgd = new DeGiayDao();
        dtmDSTT = (DefaultTableModel) this.tbl_TTSP.getModel();
        dtmDSTT.setRowCount(0);
        List<HdeGiay> dg = dgd.selectAll(); // vs trạng thái 'Đang áp dụng'
        for (HdeGiay DG : dg) {
            Object[] row = new Object[]{
                DG.getId(),
                DG.getName(),};
            dtmDSTT.addRow(row);
        }
    }

    public void insertDeGiay(String NameThuocTinh) {//Tạo đối tượng chất liệu dự vào Txt_TenThuocTinh + Status
        HdeGiay deGiay = new HdeGiay();
        deGiay.setName(NameThuocTinh.trim());
        deGiay.setStatus("Đang áp dụng");
        deGiay.setCreate_by(GetChucVu.getId());
        dgd.insert(deGiay);
        MsgBox.alter(this, "Thêm Đế Giày " + NameThuocTinh + " thành công!");
    }

    public void updateDeGiay(int rowSelected) {
        HdeGiay deGiay = new HdeGiay();
        deGiay.setId(Integer.valueOf(this.tbl_TTSP.getValueAt(rowSelected, 0).toString().trim()));//Lấy id dựa vào dòng đc chọn
        deGiay.setName(txt_tenThuocTinh.getText().trim());//Lấy name dựa vào tham số truyền vào.
        deGiay.setUpdate_by(GetChucVu.getId());//Lấy id Nhân viên update
        dgd.update(deGiay);
        MsgBox.alter(this, "Update Đế Giày thành công");
    }

//-----------------------------------Fill/Insert/Update Của Dây giày
    public void fill_DayGiay_ToTable() {
        DayGiayDao dgd = new DayGiayDao();
        dtmDSTT = (DefaultTableModel) this.tbl_TTSP.getModel();
        dtmDSTT.setRowCount(0);
        List<DayGiay> dg = dgd.selectAll(); // vs trạng thái 'Đang áp dụng'
        for (DayGiay DG : dg) {
            Object[] row = new Object[]{
                DG.getId(),
                DG.getName(),};
            dtmDSTT.addRow(row);
        }
    }

    public void insertDayGiay(String NameThuocTinh) {
        //Thiết Lập giá trị đối tượng
        DayGiay dayGiay = new DayGiay();
        dayGiay.setName(NameThuocTinh.trim());
        dayGiay.setStatus("Đang áp dụng");
        dayGiay.setCreate_by(GetChucVu.getId());
        // Gọi đến DAO để thực hiện insert
        DayGiayDao dgd = new DayGiayDao();
        dgd.insert(dayGiay);
        MsgBox.alter(this, "Thêm Dây Giày " + NameThuocTinh + " thành công!");
    }

    public void updateDayGiay(int rowSelected) {
        DayGiay dayGiay = new DayGiay();
        dayGiay.setId(Integer.valueOf(this.tbl_TTSP.getValueAt(rowSelected, 0).toString().trim()));
        dayGiay.setName(txt_tenThuocTinh.getText().trim());
        dayGiay.setUpdate_by(GetChucVu.getId());//Lấy id Nhân viên update
        // Gọi đến DAO để thực hiện update
        DayGiayDao dgd = new DayGiayDao();
        dgd.update(dayGiay);

        MsgBox.alter(this, "Update Dây Giày thành công");
    }
}
