package com.company.DAO;

import com.company.Enums.Classes;
import com.company.Enums.Racas;
import com.company.classes.Personagem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonagemDAO implements DAO<Personagem>, DAOFields {
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:PersoMod.db";

    public PersonagemDAO(){
        try{
        connection = DriverManager.getConnection(myDBConnectionString);
             } catch (SQLException throwables){
        throwables.printStackTrace();
        }
    }
    @Override
    public List<Personagem> get(String condition) {
        List <Personagem> personagems = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName()) + condition);
            while(result.next()){
                Personagem personagem = new Personagem(
                        result.getString("nome"),
                        Classes.valueOf(result.getString("classe")),
                        Racas.valueOf(result.getString("raca")),
                        result.getInt("mana"),
                        result.getInt("ataque"),
                        result.getInt("ataqueMagico"),
                        result.getInt("defesa"),
                        result.getInt("defesaMagica"),
                        result.getInt("velocidade"),
                        result.getInt("destreza"),
                        result.getInt("experiencia"),
                        result.getInt("nivel")
                );
                personagems.add(personagem);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return personagems;
    }

    @Override
    public List<Personagem> getAll() {
        List <Personagem> personagems = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()){
                Personagem personagem = new Personagem(
                        result.getString("nome"),
                        Classes.valueOf(result.getString("classe")),
                        Racas.valueOf(result.getString("raca")),
                        result.getInt("mana"),
                        result.getInt("ataque"),
                        result.getInt("ataqueMagico"),
                        result.getInt("defesa"),
                        result.getInt("defesaMagica"),
                        result.getInt("velocidade"),
                        result.getInt("destreza"),
                        result.getInt("experiencia"),
                        result.getInt("nivel")
                );
                personagems.add(personagem);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return personagems;
    }

    @Override
    public void update(Personagem personagem) {try{
        PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
        preparedStatement.setString(1, personagem.getNome());
        preparedStatement.setString(2, String.valueOf(personagem.getClasse()));
        preparedStatement.setString(3, String.valueOf(personagem.getRaca()));
        preparedStatement.setInt(4, personagem.getMana());
        preparedStatement.setInt(5, personagem.getAtaque());
        preparedStatement.setInt(6, personagem.getAtaqueMagico());
        preparedStatement.setInt(7, personagem.getDefesa());
        preparedStatement.setInt(8, personagem.getDefesaMagica());
        preparedStatement.setInt(9,personagem.getVelocidade());
        preparedStatement.setInt(10,personagem.getDestreza());
        preparedStatement.setInt(11,personagem.getExperiencia());
        preparedStatement.setInt(12,personagem.getNivel());
        int retorno = preparedStatement.executeUpdate();
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    @Override
    public void delete(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, personagem.getNome());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void create(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1, personagem.getNome());
            preparedStatement.setString(2, String.valueOf(personagem.getClasse()));
            preparedStatement.setString(3, String.valueOf(personagem.getRaca()));
            preparedStatement.setInt(4, personagem.getMana());
            preparedStatement.setInt(5, personagem.getAtaque());
            preparedStatement.setInt(6, personagem.getAtaqueMagico());
            preparedStatement.setInt(7, personagem.getDefesa());
            preparedStatement.setInt(8, personagem.getDefesaMagica());
            preparedStatement.setInt(9,personagem.getVelocidade());
            preparedStatement.setInt(10,personagem.getDestreza());
            preparedStatement.setInt(11,personagem.getExperiencia());
            preparedStatement.setInt(12,personagem.getNivel());
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getTableName() {
        return "Dados";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM "+ table +" WHERE nome = ?";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE "+ table +" SET nome = ?,classe = ?, raca= ?, mana= ?, ataque= ?, ataqueMagico= ?, defesa= ?, defesaMagica= ?, velocidade= ?, destreza= ?, experiencia= ?, nivel= ? WHERE nome =?";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+ table + "(nome,classe,raca,mana,ataque,ataqueMagico,defesa,defesaMagica,velocidade,destreza,experiencia,nivel) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }

    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM " + table + " WHERE ";
    }
}
