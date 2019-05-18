package model;

/**
 * @author
 * @version 0.0.1
 * @date 2018-03-14
 * @category 基础查詢实体层
 */
public class BaseQuery {
    /**
     * 选择条件1   例子：值为and 或  or 用于查询
     */
    private String andOr1;
    /**
     * 选择条件2
     */
    private String andOr2;
    /**
     * 选择条件3
     */
    private String andOr3;
    /**
     * 选择条件4
     */
    private String andOr4;
    /**
     * 选择条件5   例子：值为and 或  or 用于查询
     */
    private String andOr5;
    /**
     * 选择条件6
     */
    private String andOr6;
    /**
     * 选择条件7   例子：值为and 或  or 用于查询
     */
    private String andOr7;
    /**
     * 选择条件8
     */
    private String andOr8;
    /**
     * 选择条件9   例子：值为and 或  or 用于查询
     */
    private String andOr9;
    /**
     * 选择条件10
     */
    private String andOr10;
    /**
     * 选择条件9   例子：值为and 或  or 用于查询
     */
    private String andOr11;
    /**
     * 选择条件10
     */
    private String andOr12;
    /**
     * 参数名称1 例子：username  对应数据库字段
     */
    private String field1;
    /**
     * 参数名称2
     */
    private String field2;
    /**
     * 参数名称3
     */
    private String field3;
    /**
     * 参数名称4
     */
    private String field4;
    /**
     * 参数名称5
     */
    private String field5;
    /**
     * 参数名称6
     */
    private String field6;
    /**
     * 参数名称7
     */
    private String field7;
    /**
     * 参数名称8
     */
    private String field8;
    /**
     * 参数名称9
     */
    private String field9;
    /**
     * 参数名称10
     */
    private String field10;
    /**
     * 参数名称11
     */
    private String field11;
    /**
     * 参数名称12
     */
    private String field12;

    /**
     * 参数名称13
     */
    private String field13;
    /**
     * 参数名称14
     */
    private String field14;

    /**
     * 参数名称15
     */
    private String field15;

    /**
     * 参数名称16
     */
    private String field16;
    /**
     * 参数名称17
     */
    private String field17;

    /**
     * 参数名称18
     */
    private String field18;


    /**
     * 参数选择条件1  如：=,!=,>,>=,<,<=,like,between,not like
     */
    private String operator1;
    /**
     * 参数选择条件2
     */
    private String operator2;
    /**
     * 参数选择条件3
     */
    private String operator3;
    /**
     * 参数选择条件4
     */
    private String operator4;
    /**
     * 参数选择条件5
     */
    private String operator5;
    /**
     * 参数选择条件6
     */
    private String operator6;
    /**
     * 参数选择条件7  如：=,!=,>,>=,<,<=,like,between,not like
     */
    private String operator7;
    /**
     * 参数选择条件8
     */
    private String operator8;
    /**
     * 参数选择条件9
     */
    private String operator9;
    /**
     * 参数选择条件10
     */
    private String operator10;
    /**
     * 参数选择条件11
     */
    private String operator11;
    /**
     * 参数选择条件12
     */
    private String operator12;
    /**
     * 参数选择条件13
     */
    private String operator13;
    /**
     * 参数选择条件14
     */
    private String operator14;
    /**
     * 参数选择条件15
     */
    private String operator15;
    /**
     * 参数选择条件16
     */
    private String operator16;
    /**
     * 参数选择条件17
     */
    private String operator17;
    /**
     * 参数选择条件18
     */
    private String operator18;

    /**
     * 参数值1  例子： 张三，15,2018-03-15
     */
    private String value1;
    /**
     * 参数值2
     */
    private String value2;
    /**
     * 参数值3
     */
    private String value3;
    /**
     * 参数值4
     */
    private String value4;
    /**
     * 参数值5
     */
    private String value5;
    /**
     * 参数值6
     */
    private String value6;
    /**
     * 参数值7
     */
    private String value7;
    /**
     * 参数值8
     */
    private String value8;
    /**
     * 参数值9
     */
    private String value9;
    /**
     * 参数值10
     */
    private String value10;
    /**
     * 参数值11
     */
    private String value11;
    /**
     * 参数值12
     */
    private String value12;
    /**
     * 参数值13
     */
    private String value13;
    /**
     * 参数值14
     */
    private String value14;
    /**
     * 参数值15
     */
    private String value15;
    /**
     * 参数值16
     */
    private String value16;
    /**
     * 参数值17
     */
    private String value17;
    /**
     * 参数值18
     */
    private String value18;

    /**
     * 选择条件5   例子：值为and 或  or 用于查询
     */
    private String groupAndOr;
    /**
     * 选择条件5   例子：值为and 或  or 用于查询
     */
    private String groupAndOr2;
    /**
     * 选择条件5   例子：值为and 或  or 用于查询
     */
    private String groupAndOr3;
    /**
     * 选择条件5   例子：值为and 或  or 用于查询
     */
    private String groupAndOr4;
    /**
     * 选择条件5   例子：值为and 或  or 用于查询
     */
    private String groupAndOr5;


    /**
     * 排序sql 例子：username desc,gmt_create asc
     */
    private String orderSql;

    /**
     * 当前页码
     **/
    private Integer pageNum = 1;

    /**
     * 每页显示记录数
     **/
    private Integer pageSize = 10;

    public String getAndOr1() {
        return andOr1;
    }

    public void setAndOr1(String andOr1) {
        this.andOr1 = andOr1;
    }

    public String getAndOr2() {
        return andOr2;
    }

    public void setAndOr2(String andOr2) {
        this.andOr2 = andOr2;
    }

    public String getAndOr3() {
        return andOr3;
    }

    public void setAndOr3(String andOr3) {
        this.andOr3 = andOr3;
    }

    public String getAndOr4() {
        return andOr4;
    }

    public void setAndOr4(String andOr4) {
        this.andOr4 = andOr4;
    }

    public String getAndOr5() {
        return andOr5;
    }

    public void setAndOr5(String andOr5) {
        this.andOr5 = andOr5;
    }

    public String getAndOr6() {
        return andOr6;
    }

    public void setAndOr6(String andOr6) {
        this.andOr6 = andOr6;
    }

    public String getAndOr7() {
        return andOr7;
    }

    public void setAndOr7(String andOr7) {
        this.andOr7 = andOr7;
    }

    public String getAndOr8() {
        return andOr8;
    }

    public void setAndOr8(String andOr8) {
        this.andOr8 = andOr8;
    }

    public String getAndOr9() {
        return andOr9;
    }

    public void setAndOr9(String andOr9) {
        this.andOr9 = andOr9;
    }

    public String getAndOr10() {
        return andOr10;
    }

    public void setAndOr10(String andOr10) {
        this.andOr10 = andOr10;
    }

    public String getAndOr11() {
        return andOr11;
    }

    public void setAndOr11(String andOr11) {
        this.andOr11 = andOr11;
    }

    public String getAndOr12() {
        return andOr12;
    }

    public void setAndOr12(String andOr12) {
        this.andOr12 = andOr12;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

    public String getField11() {
        return field11;
    }

    public void setField11(String field11) {
        this.field11 = field11;
    }

    public String getField12() {
        return field12;
    }

    public void setField12(String field12) {
        this.field12 = field12;
    }

    public String getField13() {
        return field13;
    }

    public void setField13(String field13) {
        this.field13 = field13;
    }

    public String getField14() {
        return field14;
    }

    public void setField14(String field14) {
        this.field14 = field14;
    }

    public String getField15() {
        return field15;
    }

    public void setField15(String field15) {
        this.field15 = field15;
    }

    public String getField16() {
        return field16;
    }

    public void setField16(String field16) {
        this.field16 = field16;
    }

    public String getField17() {
        return field17;
    }

    public void setField17(String field17) {
        this.field17 = field17;
    }

    public String getField18() {
        return field18;
    }

    public void setField18(String field18) {
        this.field18 = field18;
    }

    public String getOperator1() {
        return operator1;
    }

    public void setOperator1(String operator1) {
        this.operator1 = operator1;
    }

    public String getOperator2() {
        return operator2;
    }

    public void setOperator2(String operator2) {
        this.operator2 = operator2;
    }

    public String getOperator3() {
        return operator3;
    }

    public void setOperator3(String operator3) {
        this.operator3 = operator3;
    }

    public String getOperator4() {
        return operator4;
    }

    public void setOperator4(String operator4) {
        this.operator4 = operator4;
    }

    public String getOperator5() {
        return operator5;
    }

    public void setOperator5(String operator5) {
        this.operator5 = operator5;
    }

    public String getOperator6() {
        return operator6;
    }

    public void setOperator6(String operator6) {
        this.operator6 = operator6;
    }

    public String getOperator7() {
        return operator7;
    }

    public void setOperator7(String operator7) {
        this.operator7 = operator7;
    }

    public String getOperator8() {
        return operator8;
    }

    public void setOperator8(String operator8) {
        this.operator8 = operator8;
    }

    public String getOperator9() {
        return operator9;
    }

    public void setOperator9(String operator9) {
        this.operator9 = operator9;
    }

    public String getOperator10() {
        return operator10;
    }

    public void setOperator10(String operator10) {
        this.operator10 = operator10;
    }

    public String getOperator11() {
        return operator11;
    }

    public void setOperator11(String operator11) {
        this.operator11 = operator11;
    }

    public String getOperator12() {
        return operator12;
    }

    public void setOperator12(String operator12) {
        this.operator12 = operator12;
    }

    public String getOperator13() {
        return operator13;
    }

    public void setOperator13(String operator13) {
        this.operator13 = operator13;
    }

    public String getOperator14() {
        return operator14;
    }

    public void setOperator14(String operator14) {
        this.operator14 = operator14;
    }

    public String getOperator15() {
        return operator15;
    }

    public void setOperator15(String operator15) {
        this.operator15 = operator15;
    }

    public String getOperator16() {
        return operator16;
    }

    public void setOperator16(String operator16) {
        this.operator16 = operator16;
    }

    public String getOperator17() {
        return operator17;
    }

    public void setOperator17(String operator17) {
        this.operator17 = operator17;
    }

    public String getOperator18() {
        return operator18;
    }

    public void setOperator18(String operator18) {
        this.operator18 = operator18;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

    public String getValue7() {
        return value7;
    }

    public void setValue7(String value7) {
        this.value7 = value7;
    }

    public String getValue8() {
        return value8;
    }

    public void setValue8(String value8) {
        this.value8 = value8;
    }

    public String getValue9() {
        return value9;
    }

    public void setValue9(String value9) {
        this.value9 = value9;
    }

    public String getValue10() {
        return value10;
    }

    public void setValue10(String value10) {
        this.value10 = value10;
    }

    public String getValue11() {
        return value11;
    }

    public void setValue11(String value11) {
        this.value11 = value11;
    }

    public String getValue12() {
        return value12;
    }

    public void setValue12(String value12) {
        this.value12 = value12;
    }

    public String getValue13() {
        return value13;
    }

    public void setValue13(String value13) {
        this.value13 = value13;
    }

    public String getValue14() {
        return value14;
    }

    public void setValue14(String value14) {
        this.value14 = value14;
    }

    public String getValue15() {
        return value15;
    }

    public void setValue15(String value15) {
        this.value15 = value15;
    }

    public String getValue16() {
        return value16;
    }

    public void setValue16(String value16) {
        this.value16 = value16;
    }

    public String getValue17() {
        return value17;
    }

    public void setValue17(String value17) {
        this.value17 = value17;
    }

    public String getValue18() {
        return value18;
    }

    public void setValue18(String value18) {
        this.value18 = value18;
    }

    public String getGroupAndOr() {
        return groupAndOr;
    }

    public void setGroupAndOr(String groupAndOr) {
        this.groupAndOr = groupAndOr;
    }

    public String getGroupAndOr2() {
        return groupAndOr2;
    }

    public void setGroupAndOr2(String groupAndOr2) {
        this.groupAndOr2 = groupAndOr2;
    }

    public String getGroupAndOr3() {
        return groupAndOr3;
    }

    public void setGroupAndOr3(String groupAndOr3) {
        this.groupAndOr3 = groupAndOr3;
    }

    public String getGroupAndOr4() {
        return groupAndOr4;
    }

    public void setGroupAndOr4(String groupAndOr4) {
        this.groupAndOr4 = groupAndOr4;
    }

    public String getGroupAndOr5() {
        return groupAndOr5;
    }

    public void setGroupAndOr5(String groupAndOr5) {
        this.groupAndOr5 = groupAndOr5;
    }

    public String getOrderSql() {
        return orderSql;
    }

    public void setOrderSql(String orderSql) {
        this.orderSql = orderSql;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "BaseQuery{" +
                "andOr1='" + andOr1 + '\'' +
                ", andOr2='" + andOr2 + '\'' +
                ", andOr3='" + andOr3 + '\'' +
                ", andOr4='" + andOr4 + '\'' +
                ", andOr5='" + andOr5 + '\'' +
                ", andOr6='" + andOr6 + '\'' +
                ", andOr7='" + andOr7 + '\'' +
                ", andOr8='" + andOr8 + '\'' +
                ", andOr9='" + andOr9 + '\'' +
                ", andOr10='" + andOr10 + '\'' +
                ", andOr11='" + andOr11 + '\'' +
                ", andOr12='" + andOr12 + '\'' +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                ", field6='" + field6 + '\'' +
                ", field7='" + field7 + '\'' +
                ", field8='" + field8 + '\'' +
                ", field9='" + field9 + '\'' +
                ", field10='" + field10 + '\'' +
                ", field11='" + field11 + '\'' +
                ", field12='" + field12 + '\'' +
                ", field13='" + field13 + '\'' +
                ", field14='" + field14 + '\'' +
                ", field15='" + field15 + '\'' +
                ", field16='" + field16 + '\'' +
                ", field17='" + field17 + '\'' +
                ", field18='" + field18 + '\'' +
                ", operator1='" + operator1 + '\'' +
                ", operator2='" + operator2 + '\'' +
                ", operator3='" + operator3 + '\'' +
                ", operator4='" + operator4 + '\'' +
                ", operator5='" + operator5 + '\'' +
                ", operator6='" + operator6 + '\'' +
                ", operator7='" + operator7 + '\'' +
                ", operator8='" + operator8 + '\'' +
                ", operator9='" + operator9 + '\'' +
                ", operator10='" + operator10 + '\'' +
                ", operator11='" + operator11 + '\'' +
                ", operator12='" + operator12 + '\'' +
                ", operator13='" + operator13 + '\'' +
                ", operator14='" + operator14 + '\'' +
                ", operator15='" + operator15 + '\'' +
                ", operator16='" + operator16 + '\'' +
                ", operator17='" + operator17 + '\'' +
                ", operator18='" + operator18 + '\'' +
                ", value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", value5='" + value5 + '\'' +
                ", value6='" + value6 + '\'' +
                ", value7='" + value7 + '\'' +
                ", value8='" + value8 + '\'' +
                ", value9='" + value9 + '\'' +
                ", value10='" + value10 + '\'' +
                ", value11='" + value11 + '\'' +
                ", value12='" + value12 + '\'' +
                ", value13='" + value13 + '\'' +
                ", value14='" + value14 + '\'' +
                ", value15='" + value15 + '\'' +
                ", value16='" + value16 + '\'' +
                ", value17='" + value17 + '\'' +
                ", value18='" + value18 + '\'' +
                ", groupAndOr='" + groupAndOr + '\'' +
                ", groupAndOr2='" + groupAndOr2 + '\'' +
                ", groupAndOr3='" + groupAndOr3 + '\'' +
                ", groupAndOr4='" + groupAndOr4 + '\'' +
                ", groupAndOr5='" + groupAndOr5 + '\'' +
                ", orderSql='" + orderSql + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
