# 数据库表
## MHStatus 
| 字段名 | 含义 |
| ---- | ---- |
| MHSID | 状态ID |
| MHID | 所在仓库ID |
| MID | 原料ID |
| MHPID | 批次号ID |
| MHTime | 操作时间 |
| MHNum | 操作数量 |

## MP
| 字段名 | 含义 |
| ---- | ---- |
| MPID | 批次号 |
| MID | 原料ID |
| MTime | 原料生产时间 |

## MHouse
| 字段名 | 含义 |
| ---- | ---- |
| MHID | 原料库ID |
| MHName | 原料库名称 |
| MHSite | 原料库地址 |
| MHMan | 原料库负责人ID |
| HRemark | 原料库备注 |

## MHouseLog
| 字段名 | 含义 |
| ---- | ---- |
| MHLID | 原料库日志ID |
| MHID | 操作原料库名称 |
| Oper | 操作方式 |
| MPID | 操作原料批次号ID |
| MDate | 操作日期 |
| MLNum | 操作数量 |
| MLMan | 主要负责人 |
| MLWMan | 次要负责人 |

## Materials
| 字段名 | 含义 |
| ---- | ---- |
| MID | 原料ID |
| MName | 原料名称 |
| MExpDate | 原料保质期 |
| MRemark | 原料备注 |
| MPrice | 原料单价 |

## Method
| 字段名 | 含义 |
| ---- | ---- |
| MeID | 方法ID |
| GID | 物品ID |
| MID | 原料ID |
| MNum | 所需原料数量 |

## ProducePlan 
| 字段名 | 含义 |
| ---- | ---- |
| pid | 计划ID |
| ptime | 截止时间 |
| goodid | 货物ID |
| gnum | 货物数量 |
| pworkshop | 车间 |
| pstate | 计划状态 |

<<<<<<< HEAD
## Client
| 字段名 | 含义 |
| ---- | ---- |
| C_ID | 客户ID |
| CName | 客户名称 |
| CTele | 客户电话 |
| CMail | 客户邮箱 |
| CCost | 客户消费额 |
| CRemark | 客户备注 |

## Goods 
| 字段名 | 含义 |
| ---- | ---- |
| G_ID | 货物ID |
| GName | 货物名称 |
| GType | 货物类型 |
| GExpDate | 货物保质期 |
| GRemark | 货物备注 |
| GPrice | 商品价格 |

## GoodsTyep 
| 字段名 | 含义 |
| ---- | ---- |
| GTypeID | 货物类型ID |
| typename | 货物类型名称 |

## GP
| 字段名 | 含义 |
| ---- | ---- |
| GPID | 批次名称|
| GID | 货物ID |
| GTime | 批次生成日期 |
| GShop | 批次生成车间 |

## Order 
| 字段名 | 含义 |
| ---- | ---- |
| OID | 订货号 |
| CID | 客户账号 |
| OTime | 订单时间 |
| OMID | 负责人id |
| remark | 备注 |
| OLTime | 取货时间 |

## OW 
| 字段名 | 含义 |
| ---- | ---- |
| OID | 订货号 |
| WID | 商品号 |
| num | 商品数量 |
