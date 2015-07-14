package org.project.openbaton.nfvo.vnfm_reg.impl.receiver;

import org.project.openbaton.catalogue.nfvo.CoreMessage;
import org.project.openbaton.nfvo.exceptions.NotFoundException;
import org.project.openbaton.nfvo.exceptions.VimException;
import org.project.openbaton.vnfm.interfaces.manager.VnfmReceiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.jms.JMSException;
import javax.naming.NamingException;

/**
 * Created by lto on 26/05/15.
 */
@RestController
@RequestMapping("/admin/v1/vnfm-core-actions")
public class VnfmReceiverRest implements VnfmReceiver {

    @Autowired
    private org.project.openbaton.vnfm.interfaces.manager.VnfmManager vnfmManager;
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void actionFinished(@RequestBody CoreMessage coreMessage) throws NotFoundException, NamingException, JMSException, VimException {
        log.debug("CORE: Received: " + coreMessage);
        vnfmManager.executeAction(coreMessage);

    }

}
