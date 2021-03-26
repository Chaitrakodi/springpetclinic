
package org.springframework.cheapy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cheapy.model.NuOffer;
import org.springframework.cheapy.repository.NuOfferRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NuOfferService {

	private NuOfferRepository nuOfferRepository;


	@Autowired
	public NuOfferService(final NuOfferRepository nuOfferRepository) {
		this.nuOfferRepository = nuOfferRepository;
	}

	@Transactional
	public NuOffer findNuOfferById(final int id) {
		return this.nuOfferRepository.findById(id);
	}

	@Transactional
	public List<NuOffer> findAllNuOffer() { //
		return this.nuOfferRepository.findAllNuOffer();
	}

	@Transactional
	public void saveNuOffer(final NuOffer nuOffer) throws DataAccessException { //
		this.nuOfferRepository.save(nuOffer);
	}
}
