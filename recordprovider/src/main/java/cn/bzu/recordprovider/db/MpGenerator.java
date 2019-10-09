package cn.bzu.recordprovider.db;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MpGenerator {
    // 数据库的url地址
    private final static String url = "jdbc:mysql://localhost:3306/apartmentmanage?serverTimezone=Asia/Shanghai";
    // 数据库的身份
    private final static String user = "root";
    // 数据库的密码
    private final static String password = "199703";
    // 数据库的驱动
    private final static String dirverName = "com.mysql.jdbc.Driver";
    // 注释的作者
    private final static String author = "";
    // 文件生成路径
    private final static String outputDir = "recordprovider\\src\\main\\java\\";

    public static void main(String[] args) {
        // 数据库配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(url)
                .setUsername(user)
                .setPassword(password)
                .setDriverName(dirverName);

        // 包配置
        PackageConfig pc = new PackageConfig();
        // 设置实体类的包名
        pc.setEntity("pojo");
        // 设置controller的包名
        pc.setController("controller");
        // 指定mapper.xml文件位置
        pc.setXml("mapper");
        pc.setMapper("dao");
        // 设置父报名
        pc.setParent("cn.bzu.recordprovider");

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setEntityLombokModel(false)
                .setNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix(pc.getModuleName() + "_");

        // 全局配置变量
        GlobalConfig config = new GlobalConfig();
        // 设置缓存
        config.setEnableCache(false)
                .setAuthor(author)
                // 设置输出文件路径
                .setOutputDir(outputDir)
                // 设置文件覆盖
                .setFileOverride(false)
//                .setMapperName("%sDao")
                // service层命名
                .setServiceName("%sService")
                //  设置通用查询映射结果
                .setBaseResultMap(true)
                // 通用查询结果列
                .setBaseColumnList(true)
                .setActiveRecord(true)
                .setOpen(false);

        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(pc).execute();
    }

}
