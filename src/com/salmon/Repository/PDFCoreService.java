package com.salmon.Repository;

import com.salmon.TO.PdfCore;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class PDFCoreService extends MainService<PdfCore> {
    @PersistenceContext
    EntityManager entityManager;

    public String getPdf(String uniqueHash){
    try {
        PdfCore pdfCore= (PdfCore) entityManager.createQuery("select pdf from pdfcore pdf where pdf.UNIQUEHASH=:x" )
                .setParameter("x",uniqueHash).getSingleResult();
        return pdfCore.getTitle();
    }catch (Exception e){
        e.printStackTrace();
    return null ;
}
}

    public void pdfUpdate(PdfCore pdfCores){

    entityManager.createQuery("update pdfcore o set o.TITLE=:x where o.UNIQUEHASH=:u")
            .setParameter("x",pdfCores.getTitle()).setParameter("u",pdfCores.getUniqueHash()).executeUpdate();

}


}
