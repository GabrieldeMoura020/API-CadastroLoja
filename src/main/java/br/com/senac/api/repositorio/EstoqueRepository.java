package br.com.senac.api.repositorio;

import br.com.senac.api.entidades.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    @Query("select c from estoque c where c.produtos.id = :produtos_id")
    public List<Estoque> findByProdutos(@Param("produtos_id") String produtos_id);

    @Query("select c from estoque c where c.lojas.id = :loja_id")
    public List<Estoque> findByLojas(@Param("loja_id") String loja_id);
}
