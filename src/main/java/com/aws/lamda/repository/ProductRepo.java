/*package com.aws.lamda.repository;

import com.aws.lamda.domain.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class ProductRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    Logger log = LoggerFactory.getLogger(ProductRepo.class);

    public Product createProduct(final Product product) {
        log.debug(jdbcTemplate.toString());

        String sql = "insert into users(product_name,product_dlvry_within,product_desc,prouduct_price," +
                "product_type,product_quantity) values(?,?,?,?,?,?)";
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, product.getProductName());
                ps.setString(2, product.getDeliveryWithIn());
                ps.setString(3, product.getDescription());
                ps.setDouble(4, product.getPrice());
                ps.setString(5, product.getProuductType());
                ps.setInt(6, product.getQuantity());

                return ps;
            }
        }, holder);


        return product;
    }
}

*/
