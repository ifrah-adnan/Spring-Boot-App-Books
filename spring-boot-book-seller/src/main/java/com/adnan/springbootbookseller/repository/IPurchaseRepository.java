package com.adnan.springbootbookseller.repository;

import com.adnan.springbootbookseller.models.Purchase;
import com.adnan.springbootbookseller.models.User;
import com.adnan.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IPurchaseRepository extends JpaRepository<Purchase,Long> {
    @Query("select "+ "b.title as title ,ph.price as price, ph.purchaseTime as purchaseTime "+"from Purchase ph left join Book b on b.id=ph.bookId where ph.userId=:userId")
 List<IPurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
