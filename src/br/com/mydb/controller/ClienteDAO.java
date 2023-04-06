package br.com.mydb.controller;

import br.com.mydb.connection.ConnectionFactory;
import br.com.mydb.model.Cliente;
import br.com.mydb.view.FrameCadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ClienteDAO {

    public void save(Cliente cliente) {
        String query = "INSERT INTO clientes(nomeCliente, enderecoCliente, "
                + "bairroCliente, numCliente, cepCliente, cidadeCliente, ufCliente) "
                + "VALUES(?,?,?,?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ConnectionFactory.createConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getEnderecoCliente());
            ps.setString(3, cliente.getBairroCliente());
            ps.setString(4, cliente.getNumCliente());
            ps.setString(5, cliente.getCepCliente());
            ps.setString(6, cliente.getCidadeCliente());
            ps.setString(7, cliente.getUfCliente());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Cliente> listarClientes() throws SQLException {
        String query = "SELECT * FROM clientes";

        List<Cliente> clientes = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        //Classe que recupera dados do banco
        ResultSet rs = null;

        try {
            con = ConnectionFactory.createConnection();
            ps = (PreparedStatement) con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getString("idCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
                cliente.setBairroCliente(rs.getString("bairroCliente"));
                cliente.setNumCliente(rs.getString("numCliente"));
                cliente.setCepCliente(rs.getString("cepCliente"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setUfCliente(rs.getString("ufCliente"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return clientes;
    }
    
    public void alterar(Cliente cliente){
        String query = "UPDATE clientes SET nomeCliente = ?, enderecoCliente = ?, "
                + "bairroCliente = ?, numCliente = ?, cepCliente = ?, "
                + "cidadeCliente = ?, ufCliente = ? WHERE idCliente = ?";
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = ConnectionFactory.createConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getEnderecoCliente());
            ps.setString(3, cliente.getBairroCliente());
            ps.setString(4, cliente.getNumCliente());
            ps.setString(5, cliente.getCepCliente());
            ps.setString(6, cliente.getCidadeCliente());
            ps.setString(7, cliente.getUfCliente());
            ps.setString(8, cliente.getIdCliente());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void deletar(Cliente cliente){
        String query = "DELETE FROM clientes WHERE idCliente = ?";
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = ConnectionFactory.createConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getIdCliente());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
