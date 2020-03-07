package ca.sapt.currencyconverter.repository;

import ca.sapt.currencyconverter.model.Currency;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CurrencyRepo extends CrudRepository<Long, Currency> {
}
