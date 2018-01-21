package ua.agabry.rootcontext.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RootServiceImp implements RootService {

    private static int count = 0;

    private Integer serialNumber;
    private List<String> consumers;

    @Autowired
    private ApplicationContext appContext;

    public RootServiceImp() {
        count++;
        this.serialNumber = count;
        this.consumers = new ArrayList<>();
    }

    @Override
    public String getClassName() {
        return this.getClass().getName();
    }

    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public Integer countOfInstance() {
        return count;
    }

    @Override
    public void addConsumer(String className) {
        this.consumers.add(className);
    }

    @Override
    public List<String> getConsumers() {
        return this.consumers;
    }

    @Override
    public ApplicationContext getAppContext() {
        return this.appContext;
    }
}
