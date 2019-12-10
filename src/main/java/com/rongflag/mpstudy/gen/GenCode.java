package com.rongflag.mpstudy.gen;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : aihuxi
 * @version V1.0
 * @Project: mp-study
 * @Package com.rongflag.mpstudy.gen
 * @Description: 模拟生成代码
 * @email worongbo@163.com
 * @date 2019年12月10日 17:07
 */
public class GenCode {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = getGlobalConfig();
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = getDataSourceConfig();
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = getPackageConfig();
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = getInjectionConfig();
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = getTemplateConfig();
        mpg.setTemplate(templateConfig);
        // 策略配置
        StrategyConfig strategy = getStrategyConfig();
        mpg.setStrategy(strategy);
        mpg.execute();
    }

    /**
     * 策略配置
     * @return
     */
    private static StrategyConfig getStrategyConfig() {
        StrategyConfig config = new StrategyConfig();
        config.setEntityBuilderModel(false);
        config.setNaming(NamingStrategy.underline_to_camel);
        config.setColumnNaming(NamingStrategy.underline_to_camel);
        config.setSuperEntityClass(Object.class);
        config.setInclude("");
        config.setEntityLombokModel(true);
        config.setLogicDeleteFieldName("del_flag");
        config.setVersionFieldName("version");
        List<TableFill> list = new ArrayList<>();
        list.add(new TableFill("create_time", FieldFill.INSERT));
        list.add(new TableFill("create_by", FieldFill.INSERT));
        list.add(new TableFill("update_time", FieldFill.INSERT_UPDATE));
        list.add(new TableFill("update_by", FieldFill.INSERT_UPDATE));
        config.setTableFillList(list);

        return config;
    }

    /**
     *  配置模板
     * @return
     */
    private static TemplateConfig getTemplateConfig() {
        TemplateConfig config = new TemplateConfig();
        return config;
    }

    /**
     * 自定义配置
     * @return
     */
    private static InjectionConfig getInjectionConfig() {
        return  new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
    }


    /**
     * 配置包
     * @return
     */
    private static PackageConfig getPackageConfig() {
        PackageConfig config = new PackageConfig();
        config.setParent("com.rongflag.mpstudy");
        return  config;
    }

    /**
     * 配置数据源
     * @return
     */
    private static DataSourceConfig getDataSourceConfig() {
        DataSourceConfig config = new DataSourceConfig();
        config.setDbType(DbType.HSQL)
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://127.0.0.1:3306/jeecg-boot?characterEncoding=UTF-8&useUnicode=true&useSSL=false&serverTimezone=UTC")
                .setUsername("root")
                .setPassword("123456");

        return config;
    }

    /**
     * 全局配置
     * @return
     */
    private static GlobalConfig getGlobalConfig() {
        GlobalConfig config = new GlobalConfig();
        config.setBaseColumnList(true);
        config.setBaseResultMap(true);
        config.setOutputDir("D//out").setOpen(true).setFileOverride(true).setIdType(IdType.ASSIGN_ID).setAuthor("aihuxi");
        return config;
    }
}
