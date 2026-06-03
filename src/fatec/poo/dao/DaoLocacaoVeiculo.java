package fatec.poo.dao;

import fatec.poo.model.LocacaoVeiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoLocacaoVeiculo {

    private Connection conn;

    public DaoLocacaoVeiculo(Connection conn) {
        this.conn = conn;
    }

    public LocacaoVeiculo consultar(int codigo) {
        LocacaoVeiculo objLoc = null;

        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblLocacao where Codigo = ?");

            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objLoc = new LocacaoVeiculo(rs.getInt("Codigo"), rs.getString("NomeCliente"));
                objLoc.setTipoCliente(rs.getString("TipoCliente"));
                objLoc.setTaxaLocacao(rs.getDouble("TaxaLocacao"));
                objLoc.setKmRodados(rs.getInt("KmRodados"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return objLoc;
    }
}
